using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Configuration;

public partial class p14 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        try
        {
            string constr = ConfigurationManager.ConnectionStrings["ConString"].ConnectionString;
            SqlConnection conn = new SqlConnection(constr);
            SqlCommand cmd = new SqlCommand("myInsert", conn);
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.Add("@cname", SqlDbType.VarChar).Value = TextBox1.Text;
            conn.Open();
            cmd.ExecuteNonQuery();
            conn.Close();
            Response.Write("Record is Insertrd....");
        }catch(SqlException ex){
            Response.Write("SQL " + ex.Message);
        }
    }
}