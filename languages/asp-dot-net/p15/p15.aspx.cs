using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class p15 : System.Web.UI.Page
{
    SqlConnection cn;
    string constr = ConfigurationManager.ConnectionStrings["ConString"].ConnectionString;
    protected void Page_Load(object sender, EventArgs e)
    {
        cn = new SqlConnection(constr);
        if (!IsPostBack)
        {
            datalist_bind();
        }
    }
    public void datalist_bind()
    {
        SqlDataAdapter sda = new SqlDataAdapter("select * from Categories",cn);
        DataSet da = new DataSet();
        sda.Fill(da, "Categories");
        DataList1.DataSource = da.Tables[0];
        DataList1.DataBind();
    }
    protected void DataList1_CancelCommand(object source, DataListCommandEventArgs e)
    {
        DataList1.EditItemIndex = -1;
        datalist_bind();
    }
   
    protected void DataList1_EditCommand(object source, DataListCommandEventArgs e)
    {
        DataList1.EditItemIndex = e.Item.ItemIndex;
        datalist_bind();
    }
    protected void DataList1_ItemCommand(object source, DataListCommandEventArgs e)
    {
        cn = new SqlConnection(constr);
        if (e.CommandName == "Insert")
        {
            TextBox txt = (TextBox)e.Item.FindControl("TextBox1");
            SqlCommand cmd=new SqlCommand();
            cmd.Parameters.AddWithValue("@cname", SqlDbType.VarChar).Value = txt.Text;
            cmd.CommandText="INSERT INTO Categories VALUES (@cname)";
            cmd.Connection = cn;
            cn.Open();
            cmd.ExecuteNonQuery();
            cn.Close();
            Response.Write("Inserted Successfully");
            datalist_bind();
        }
        else if (e.CommandName == "Update")
        {
            TextBox txt = (TextBox)e.Item.FindControl("TextBox2");
            Label Cid = (Label)e.Item.FindControl("Label3");
            SqlCommand cmd = new SqlCommand();
            cmd.Parameters.AddWithValue("@cname", SqlDbType.VarChar).Value = txt.Text;
            cmd.Parameters.AddWithValue("@cid", SqlDbType.Int).Value = Cid.Text;
            cmd.CommandText = "UPDATE Categories SET Cname = @cname WHERE CId = @cid";
            cmd.Connection = cn;
            cn.Open();
            cmd.ExecuteNonQuery();
            cn.Close();
            Response.Write("Updated Successfully");
            datalist_bind();
        }
        else if (e.CommandName == "Delete")
        {
            Label cid = (Label)e.Item.FindControl("Label1");
            Label cname = (Label)e.Item.FindControl("Label2");
            SqlCommand cmd = new SqlCommand();
            cmd.Parameters.AddWithValue("@cid", SqlDbType.VarChar).Value = cid.Text;
            cmd.CommandText = "DELETE FROM Categories WHERE CId = @cid";
            cmd.Connection = cn;
            cn.Open();
            cmd.ExecuteNonQuery();
            cn.Close();
            Response.Write("Record Deleted SuccessFully");
            datalist_bind();
        }
    }
}