using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class pr17 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        BindListView();
    }

    private void BindListView()
    {
        SqlConnection cn = new SqlConnection(ConfigurationManager.ConnectionStrings["dbConn"].ConnectionString);
        SqlDataAdapter sda = new SqlDataAdapter("SELECT * FROM tblProducts",cn);
        DataSet ds = new DataSet();
        sda.Fill(ds);
        ListView1.DataSource = ds.Tables[0];
        ListView1.DataBind();
    }
    protected void ListView1_ItemCanceling(object sender, ListViewCancelEventArgs e)
    {
        ListView1.EditIndex = -1;
        BindListView();
    }
    protected void ListView1_ItemEditing(object sender, ListViewEditEventArgs e)
    {
        ListView1.EditIndex = ListView1.SelectedIndex;
        BindListView();
    }
    protected void ListView1_PreRender(object sender, EventArgs e)
    {
        BindListView();
    }
}