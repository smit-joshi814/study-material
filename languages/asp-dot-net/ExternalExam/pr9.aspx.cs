using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class pr9 : System.Web.UI.Page
{

    protected void Page_Load(object sender, EventArgs e)
    {
        SqlConnection conn = new SqlConnection(ConfigurationManager.ConnectionStrings["dbConn"].ConnectionString);
        SqlDataAdapter sda = new SqlDataAdapter("SELECT * FROM tblcategory", conn);
        DataSet ds = new DataSet();
        sda.Fill(ds);

        DropDownList1.DataSource = ds.Tables[0];
        DropDownList1.DataTextField = "SubCatName";
        DropDownList1.DataValueField = "Id";
        DropDownList1.DataBind();

        ds.Clear();
        sda = new SqlDataAdapter("SELECT * FROM tblProducts", conn);
        sda.Fill(ds);
        DropDownList2.DataSource = ds.Tables[0];
        DropDownList2.DataTextField = "ProductName";
        DropDownList2.DataValueField = "Id";
        DropDownList2.DataBind();

    
    }
    protected void DropDownList1_SelectedIndexChanged(object sender, EventArgs e)
    {
    }
}