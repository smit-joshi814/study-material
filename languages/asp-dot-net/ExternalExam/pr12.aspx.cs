using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class pr12 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        GridView1.DataSource = BindGridView();
        GridView1.DataBind();
    }

    private DataView BindGridView()
    {
        SqlConnection conn = new SqlConnection(ConfigurationManager.ConnectionStrings["dbConn"].ConnectionString);
        SqlDataAdapter sda = new SqlDataAdapter("SELECT * FROM tblCustomers", conn);
        DataSet ds = new DataSet();
        sda.Fill(ds);

        DataView dv = new DataView(ds.Tables[0]);
        if (ViewState["sort"] != null)
        {
            dv.Sort = ViewState["sort"].ToString();
        }
        else
        {
            dv = ds.Tables[0].DefaultView;
        }
        return dv;
    }
    protected void GridView1_Sorting(object sender, GridViewSortEventArgs e)
    {
        ViewState["sort"] = e.SortExpression;
        GridView1.DataSource = BindGridView();
        GridView1.DataBind();
    }
    protected void GridView1_PageIndexChanging(object sender, GridViewPageEventArgs e)
    {
        GridView1.PageIndex = e.NewPageIndex;
        GridView1.DataSource = BindGridView();
        GridView1.DataBind();
    }
}