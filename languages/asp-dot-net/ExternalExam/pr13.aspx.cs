using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class pr13 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        SqlConnection conn = new SqlConnection(ConfigurationManager.ConnectionStrings["dbConn"].ConnectionString);
        SqlDataAdapter sda=new SqlDataAdapter("SELECT * FROM tblCustomers",conn);
        DataSet ds = new DataSet();
        sda.Fill(ds);
        ds.WriteXml(@"D:\LEARNING\COLLAGE\SAM5\503\PRACTICALS\ExternalExam\mbDb.xml");
        Response.Write("Write SuccessFully");
    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        DataSet ds = new DataSet();
        ds.ReadXml(@"D:\LEARNING\COLLAGE\SAM5\503\PRACTICALS\ExternalExam\mbDb.xml");
        GridView1.DataSource = ds.Tables[0];
        GridView1.DataBind();
    }
}