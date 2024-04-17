using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

public partial class index : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        loadConnection();
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        SqlConnection cn = new SqlConnection(@"Data Source=(LocalDB)\v11.0;AttachDbFilename=D:\LEARNING\COLLAGE\SAM5\503\PRACTICALS\pr8\App_Data\Database.mdf;Integrated Security=True");
        SqlCommand cmd = new SqlCommand();
        cmd.Parameters.AddWithValue("@cname", TextBox1.Text);
        cmd.CommandText = "Insert into categories values(@cname)";
        cmd.Connection = cn;
        cn.Open();
        cmd.ExecuteNonQuery();
        cn.Close();
        loadConnection();
    }
    protected void loadConnection()
    {
        SqlConnection cn = new SqlConnection(@"Data Source=(LocalDB)\v11.0;AttachDbFilename=D:\LEARNING\COLLAGE\SAM5\503\PRACTICALS\pr8\App_Data\Database.mdf;Integrated Security=True");
        SqlDataAdapter sda = new SqlDataAdapter("select * from categories", cn);
        DataSet ds = new DataSet();
        sda.Fill(ds, "categories");
        DropDownList1.DataSource = ds.Tables[0];
        DropDownList1.DataTextField = "cname";
        DropDownList1.DataValueField = "cid";
        DropDownList1.DataBind();


    }
}