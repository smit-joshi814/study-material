using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class p12 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        GridView1.DataSource = Grid_Bind();
        GridView1.DataBind();

    }
    protected void GridView1_Sorting(object sender, GridViewSortEventArgs e)
    {
        ViewState["Sort"] = e.SortExpression;
        GridView1.DataSource = Grid_Bind();
        GridView1.DataBind();
    }
    protected void GridView1_PageIndexChanging(object sender, GridViewPageEventArgs e)
    {
        GridView1.PageIndex=e.NewPageIndex;
        GridView1.DataSource = Grid_Bind();
        GridView1.DataBind();
    }
    protected DataView Grid_Bind()
    {
        string constr = ConfigurationManager.ConnectionStrings["ConString"].ConnectionString;
        SqlConnection cn = new SqlConnection(constr);
        string query = "select * from Categories";
        SqlDataAdapter da = new SqlDataAdapter(query, cn);
        DataSet ds = new DataSet();
        da.Fill(ds, "Categories");

        DataView dv = new DataView(ds.Tables["Categories"]);
        if (ViewState["Sort"] != null)
        {
            dv.Sort = ViewState["Sort"].ToString();
        }
        else
        {
            dv = ds.Tables["Categories"].DefaultView;
        }
        return dv;
    }
}