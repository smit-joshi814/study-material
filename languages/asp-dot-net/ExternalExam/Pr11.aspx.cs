using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Pr11 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        BindtableProducts();
    }

    private void BindtableProducts()
    {
        SqlConnection conn = new SqlConnection(ConfigurationManager.ConnectionStrings["dbConn"].ConnectionString);
        SqlCommand cmd = new SqlCommand("SELECT * FROM tblProducts",conn);
        SqlDataAdapter sda = new SqlDataAdapter(cmd);
        DataSet ds = new DataSet();
        sda.Fill(ds);
        Repeater1.DataSource = ds.Tables[0];
        Repeater1.DataBind();
    }
}