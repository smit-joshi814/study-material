using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class pr15 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            LoadData();
        }
        
    }

    private void LoadData()
    {
        SqlConnection conn = new SqlConnection(ConfigurationManager.ConnectionStrings["dbConn"].ConnectionString);
        SqlDataAdapter sda = new SqlDataAdapter("SELECT * FROM tblCustomers", conn);
        DataSet ds = new DataSet();
        sda.Fill(ds);
        Datalist1.DataSource = ds.Tables[0];
        Datalist1.DataBind();
    }
    protected void Datalist1_CancelCommand(object source, DataListCommandEventArgs e)
    {
        Datalist1.EditItemIndex = -1;
        LoadData();
    }
    protected void Datalist1_EditCommand(object source, DataListCommandEventArgs e)
    {
        Datalist1.EditItemIndex =e.Item.ItemIndex;
        LoadData();
    }
    protected void Datalist1_ItemCommand(object source, DataListCommandEventArgs e)
    {
        SqlConnection conn = new SqlConnection(ConfigurationManager.ConnectionStrings["dbCOnn"].ConnectionString);
        if (e.CommandName == "Update")
        {
            Label lblid = (Label)e.Item.FindControl("lblId");
            TextBox txtName = (TextBox)e.Item.FindControl("txtName");
            TextBox txtNum = (TextBox)e.Item.FindControl("txtNum");
            SqlCommand cmd = new SqlCommand("UPDATE tblCustomers SET CustName=@CustName , CustNum=@CustNum WHERE Id=@id", conn);
            cmd.Parameters.AddWithValue("@CustName", SqlDbType.NChar).Value=txtName.Text;
            cmd.Parameters.AddWithValue("@CustNum", txtNum.Text);
            cmd.Parameters.AddWithValue("@id", lblid.Text);
            cmd.Connection = conn;
            conn.Open();
            cmd.ExecuteNonQuery();
            conn.Close();
            Response.Write("Customer Updated SuccessFully");
            LoadData();
        }
        else if (e.CommandName == "Delete")
        {
            Label lblid = (Label)e.Item.FindControl("Label1");
            SqlCommand cmd = new SqlCommand("DELETE FROM tblCustomers WHERE Id=@id", conn);
            cmd.Parameters.AddWithValue("@id", lblid.Text);
            cmd.Connection = conn;
            conn.Open();
            cmd.ExecuteNonQuery();
            cmd.Clone();
            Response.Write("Customer Removed SuccessFully");
            LoadData();
        }
        else if (e.CommandName == "insert")
        {
            TextBox txtName = (TextBox)e.Item.FindControl("txtnewName");
            TextBox txtNum = (TextBox)e.Item.FindControl("txtnewNum");
            SqlCommand cmd = new SqlCommand("INSERT INTO tblCustomers (CustName,CustNum) VALUES (@CustName,@CustNum)");
            cmd.Parameters.AddWithValue("@CustName", txtName.Text);
            cmd.Parameters.AddWithValue("@CustNum", txtNum.Text);
            cmd.Connection = conn;
            conn.Open();
            cmd.ExecuteNonQuery();
            conn.Close();
            Response.Write("Customer Added SuccessFully");
            LoadData();
        }
    }
}