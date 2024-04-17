using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class p15 : System.Web.UI.Page
{
    SqlConnection cn;
    protected void Page_Load(object sender, EventArgs e)
    {
        cn = new SqlConnection(@"Data Source=(LocalDB)\v11.0;AttachDbFilename=E:\SMIT\p8\App_Data\Database.mdf;Integrated Security=True");
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
    protected void DataList1_DeleteCommand(object source, DataListCommandEventArgs e)
    {

    }
    protected void DataList1_EditCommand(object source, DataListCommandEventArgs e)
    {
        DataList1.EditItemIndex = e.Item.ItemIndex;
        datalist_bind();
    }
    protected void DataList1_ItemCommand(object source, DataListCommandEventArgs e)
    {
        SqlConnection cn = new SqlConnection(@"Data Source=(LocalDB)\v11.0;AttachDbFilename=E:\SMIT\p8\App_Data\Database.mdf;Integrated Security=True");
        if (e.CommandName == "Insert")
        {
            TextBox txt = (TextBox)e.Item.FindControl("@TextBox1");
            SqlCommand cmd=new SqlCommand();
            cmd.Parameters.AddWithValue("@cname", SqlDbType.VarChar).Value = txt.Text;
            cmd.CommandText="INSERT INTO Categories values (@cname)";
            cn.Open();
            cmd.ExecuteNonQuery();
            cn.Close();
            Response.Write("Inserted Successfully");
            datalist_bind();
        }
        else if (e.CommandName == "Update")
        {
            TextBox txt = (TextBox)e.Item.FindControl("@TextBox2");
            Label id = (Label)e.Item.FindControl("@Label3");
            SqlCommand cmd = new SqlCommand();
            cmd.Parameters.AddWithValue("@cname", SqlDbType.VarChar).Value = txt.Text;
            cmd.Parameters.AddWithValue("@Label3", SqlDbType.Int).Value = id.Text;
            cmd.CommandText = "UPDATE Categories set Cname= @cname where Cid =id";
            cn.Open();
            cmd.ExecuteNonQuery();
            cn.Close();
            Response.Write("Inserted Successfully");
            datalist_bind();
        }
    }
}