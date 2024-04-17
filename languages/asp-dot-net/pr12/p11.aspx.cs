using System;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class p11 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
   
    protected void Button1_Click(object sender, EventArgs e)
    {
        SqlConnection cn = new SqlConnection(@"Data Source=(LocalDB)\v11.0;AttachDbFilename=D:\LEARNING\COLLAGE\SAM5\503\PRACTICALS\pr12\App_Data\Database.mdf;Integrated Security=True");
        SqlDataAdapter sda = null;
        if (dl.SelectedIndex == 0)
        {
            string query = "select * from Products";
            sda = new SqlDataAdapter(query, cn);
            DataSet ds = new DataSet();
            sda.Fill(ds, "Products");
            Response.Write("<table cellspacing=1 cellpadding=10><caption>"+dl.SelectedValue+"</caption>");
            Response.Write("<tr><th>Pid</th><th>Pname</th><th>Cid</th></tr>");
            for(int i=0;i<ds.Tables["Products"].Rows.Count;i++)
            {
                Response.Write("<tr><td>" + ds.Tables["Products"].Rows[i].ItemArray.GetValue(0).ToString() +"</td>");
                Response.Write("<td>" + ds.Tables["Products"].Rows[i].ItemArray.GetValue(1).ToString() + "</td>");
                Response.Write("<td>" + ds.Tables["Products"].Rows[i].ItemArray.GetValue(2).ToString() + "</td></tr>");
            }
            Response.Write("</table>");
        }
        else if (dl.SelectedIndex == 1)
        {
            
            string query = "select * from Categories";
            sda = new SqlDataAdapter(query, cn);
            DataSet ds = new DataSet();
            sda.Fill(ds, "Products");
            Response.Write("<table cellspacing=1 cellpadding=10><caption>" + dl.SelectedValue + "</caption>");
            Response.Write("<tr><th>Cid</th><th>Cname</th></tr>");
            for (int i = 0; i < ds.Tables["Products"].Rows.Count; i++)
            {
                Response.Write("<tr><td>" + ds.Tables["Products"].Rows[i].ItemArray.GetValue(0).ToString() + "</td>");
                Response.Write("<td>" + ds.Tables["Products"].Rows[i].ItemArray.GetValue(1).ToString() + "</td></tr>");
                
            }
            Response.Write("</table>");
        }
    }
    protected void Button2_Click(object sender, EventArgs e)
    {
        SqlConnection cn = new SqlConnection(@"Data Source=(LocalDB)\v11.0;AttachDbFilename=D:\LEARNING\COLLAGE\SAM5\503\PRACTICALS\pr12\App_Data\Database.mdf;Integrated Security=True");
        SqlDataAdapter sda = null;
        if (dl.SelectedIndex == 0)
        {
            string query = "select * from Products";
            sda = new SqlDataAdapter(query, cn);
            DataSet ds = new DataSet();
            sda.Fill(ds, "Products");
            GridView1.DataSource = ds.Tables[0];
            GridView1.DataBind();
        }
        else if (dl.SelectedIndex == 1)
        {
            string query = "select * from Categories";
            sda = new SqlDataAdapter(query, cn);
            DataSet ds = new DataSet();
            sda.Fill(ds, "Categories");
            GridView1.DataSource = ds.Tables[0];
            GridView1.DataBind();
        }
    }
}