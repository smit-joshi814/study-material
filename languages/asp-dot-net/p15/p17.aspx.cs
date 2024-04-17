using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;


public partial class p17 : System.Web.UI.Page
{
    SqlConnection cn;
    string constr = ConfigurationManager.ConnectionStrings["ConString"].ConnectionString;
    protected void Page_Load(object sender, EventArgs e)
    {
        cn = new SqlConnection(constr);
        //bind();   
    }
    public void bind()
    {
        SqlConnection cn = new SqlConnection(constr);
        SqlDataAdapter sda = new SqlDataAdapter("select * from Categories", cn);
        DataSet da = new DataSet();
        sda.Fill(da, "Categories");
        ListView1.DataSource = da.Tables[0];
        ListView1.DataBind();
    }

    protected void ListView1_ItemCanceling(object sender, ListViewCancelEventArgs e)
    {
        ListView1.EditIndex = -1;
        bind();
    }
   
    protected void ListView1_ItemDeleting(object sender, ListViewDeleteEventArgs e)
    {
        Label cid = (Label)ListView1.Items[e.ItemIndex].FindControl("Label1");       
        SqlCommand cmd = new SqlCommand();
        cmd.Parameters.AddWithValue("@cid", SqlDbType.VarChar).Value = cid.Text;
        cmd.CommandText = "DELETE FROM Categories WHERE CId = @cid";
        cmd.Connection = cn;
        cn.Open();
        cmd.ExecuteNonQuery();
        cn.Close();
        Response.Write("Record Deleted SuccessFully");
        bind();
    }
    protected void ListView1_ItemEditing(object sender, ListViewEditEventArgs e)
    {
        ListView1.EditIndex = ListView1.SelectedIndex;
        bind();
    }
   
   
    
    protected void ListView1_ItemUpdating(object sender, ListViewUpdateEventArgs e)
    {
        TextBox txt = (TextBox)ListView1.Items[e.ItemIndex].FindControl("TextBox2");
        Label cid = (Label)ListView1.Items[e.ItemIndex].FindControl("Label3");
        SqlCommand cmd = new SqlCommand();
        cmd.Parameters.AddWithValue("@cname", SqlDbType.VarChar).Value = txt.Text;
        cmd.Parameters.AddWithValue("@cid", SqlDbType.Int).Value = cid.Text;
        cmd.CommandText = "UPDATE Categories SET Cname = @cname WHERE CId = @cid";
        cmd.Connection = cn;
        cn.Open();
        cmd.ExecuteNonQuery();
        cn.Close();
        Response.Write("Updated Successfully");
        bind();
    }
    
    protected void ListView1_PreRender(object sender, EventArgs e)
    {
        bind();
    }
   
}