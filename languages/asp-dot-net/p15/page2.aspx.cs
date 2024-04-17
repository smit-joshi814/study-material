using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Data;
using System.Configuration;

public partial class page2 : System.Web.UI.Page
{
    string constr = ConfigurationManager.ConnectionStrings["ConString"].ConnectionString;
    SqlConnection cn;
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            loadCategory();
            loadProducts();
        }
       
    }
    protected void adCat_Click(object sender, EventArgs e)
    {
        cn = new SqlConnection(constr);
        SqlCommand cmd = new SqlCommand();
        cmd.Parameters.AddWithValue("@cname", catN.Text);
        cmd.CommandText = "insert into Categories values (@cname)";
        cmd.Connection = cn;
        cn.Open();
        cmd.ExecuteNonQuery();
        cn.Close();
        loadCategory();
    }
    protected void loadCategory()
    {
        cn = new SqlConnection(constr);
        // Response.Write("Connection Ok");
        SqlDataAdapter sda = new SqlDataAdapter("select * from Categories",cn);
       
        DataSet ds = new DataSet();
        sda.Fill(ds, "Categories");
        sCat.DataSource=ds.Tables["Categories"];
        sCat.DataTextField="Cname";
        sCat.DataValueField="Cid";
        sCat.DataBind();
    }
    protected void loadProducts()
    {
        //Response.Write(val);
        cn = new SqlConnection(constr);
        string query = "select Pname,Pid from Products where Cid = "+sCat.SelectedItem.Value;
        SqlDataAdapter sda2 = new SqlDataAdapter(query, cn);
        DataSet ds2 = new DataSet();
        sda2.Fill(ds2, "Products");
        sProd.DataSource = ds2.Tables["Products"];
        sProd.DataTextField = "Pname";
        sProd.DataValueField = "Pid";
        sProd.DataBind();
    }
    protected void adPro_Click(object sender, EventArgs e)
    {
        cn = new SqlConnection(constr);
        SqlCommand cmd = new SqlCommand();
        cmd.Parameters.AddWithValue("@pname", pName.Text);
        cmd.Parameters.AddWithValue("@cid", sCat.SelectedItem.Value);
        cmd.CommandText = "insert into Products values(@pname,@cid)";
        cmd.Connection = cn;
        cn.Open();
        cmd.ExecuteNonQuery();
        cn.Close();
    }
    protected void upd_Click(object sender, EventArgs e)
    {
        cn = new SqlConnection(constr);
        SqlCommand cmd = new SqlCommand();
        cmd.Parameters.AddWithValue("@cname", catN.Text);
        cmd.Parameters.AddWithValue("@cup", sCat.SelectedItem.Value);
        cmd.CommandText = "Update Categories set Cname = @cname where Pid= @cup";
        cmd.Connection = cn;
        cn.Open();
        cmd.ExecuteNonQuery();
        cn.Close();
        loadProducts();
    }
    protected void del_Click(object sender, EventArgs e)
    {
        cn = new SqlConnection(constr);
        SqlCommand cmd = new SqlCommand();
        cmd.Parameters.AddWithValue("@cname",catN.Text);
        cmd.CommandText = "delete Categories where Cname = @Cname";
        cmd.Connection = cn;
        cn.Open();
        cmd.ExecuteNonQuery();
        cn.Close();
        loadCategory();
    }


    protected void updPro_Click(object sender, EventArgs e)
    {
        cn = new SqlConnection(constr);
        SqlCommand cmd = new SqlCommand();
        cmd.Parameters.AddWithValue("@pname", pName.Text);
        cmd.Parameters.AddWithValue("@pid", sProd.SelectedItem.Value);
        cmd.CommandText = "Update Products set Pname = @cpname where Pid = @pid";
        cmd.Connection = cn;
        cn.Open();
        cmd.ExecuteNonQuery();
        cn.Close();
        loadProducts();
    }
    protected void Button2_Click(object sender, EventArgs e)
    {
        cn = new SqlConnection(constr);
        SqlCommand cmd = new SqlCommand();
        cmd.Parameters.AddWithValue("@pid", sProd.SelectedItem.Value);
        cmd.CommandText = "delete Products where Pid = @pid";
        cmd.Connection = cn;
        cn.Open();
        cmd.ExecuteNonQuery();
        cn.Close();
        loadProducts();
    }

   
    protected void sCat_SelectedIndexChanged(object sender, EventArgs e)
    {
        loadProducts();
    }
   
}