using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class pr10 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            BindDropDiown();
        }
        
    }

    private void BindDropDiown()
    {
        SqlConnection conn = new SqlConnection(ConfigurationManager.ConnectionStrings["dbConn"].ConnectionString);
        SqlDataAdapter sda = new SqlDataAdapter("SELECT * FROM tblCategory", conn);
        DataSet ds = new DataSet();
        sda.Fill(ds);

        DropDownList1.DataSource = ds.Tables[0];
        DropDownList1.DataTextField = "SubCatName";
        DropDownList1.DataValueField = "id";
        DropDownList1.DataBind();
        BindGridView();
    }

    private void BindGridView()
    {
        SqlConnection conn = new SqlConnection(ConfigurationManager.ConnectionStrings["dbConn"].ConnectionString);
        string cid = DropDownList1.SelectedItem.Value;
        SqlCommand cmd = new SqlCommand("SELECT * FROM tblProducts WHERE cid=@cid", conn);
        cmd.Parameters.AddWithValue("cid", cid);
        SqlDataAdapter sda = new SqlDataAdapter(cmd);
        DataSet ds = new DataSet();
        sda.Fill(ds);
        GridView1.DataSource = ds;
        GridView1.DataBind();
    }

    protected void DropDownList1_SelectedIndexChanged(object sender, EventArgs e)
    {
        BindGridView();
    }
}