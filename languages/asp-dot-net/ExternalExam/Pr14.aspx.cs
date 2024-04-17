using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Pr14 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        BindGridView();
    }
    private void BindGridView()
    {
        SqlConnection conn = new SqlConnection(ConfigurationManager.ConnectionStrings["dbConn"].ConnectionString);
        SqlDataAdapter sda = new SqlDataAdapter("SELECT * FROM tblCustomers", conn);
        DataSet ds = new DataSet();
        sda.Fill(ds);
        GridView1.DataSource = ds.Tables[0];
        GridView1.DataBind();
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        SqlConnection conn = new SqlConnection(ConfigurationManager.ConnectionStrings["dbConn"].ConnectionString);
        SqlCommand cmd = new SqlCommand("ps_CustOperations", conn);
        cmd.Parameters.AddWithValue("@CustName", TextBox1.Text);
        cmd.Parameters.AddWithValue("@CustNum", TextBox2.Text);
        cmd.CommandType = CommandType.StoredProcedure;
        cmd.Connection = conn;
        conn.Open();
        cmd.ExecuteNonQuery();
        conn.Close();
        Response.Write("Record Inserted Successfully");
        BindGridView();
    }
}