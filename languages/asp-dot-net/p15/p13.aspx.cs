using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class p13 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        DataSet ds = new DataSet();
        ds.ReadXml("@~ data/myFile.xml");
        GridView1.DataSource = ds.Tables[0];
        GridView1.DataBind();

    }
    protected void Button2_Click(object sender, EventArgs e)
    {
        string constr = ConfigurationManager.ConnectionStrings["ConString"].ConnectionString;
        SqlConnection conn = new SqlConnection(constr);
        SqlDataAdapter da = new SqlDataAdapter("SELECT * FROM Products", conn);
        DataSet ds = new DataSet();
        da.Fill(ds, "products");

        ds.WriteXml("E:/SMIT/myFile.xml");
    }

}