using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;

public partial class p14 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        try
        {
            SqlConnection conn = new SqlConnection(@"Data Source=(LocalDB)\v11.0;AttachDbFilename=D:\LEARNING\COLLAGE\SAM5\503\PRACTICALS\pr12\App_Data\Database.mdf;Integrated Security=True");
            SqlCommand cmd = new SqlCommand("myInsert", conn);
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.Add("@cname", SqlDbType.VarChar).Value = TextBox1.Text;

            conn.Open();
            cmd.ExecuteNonQuery();
            conn.Close();
            Response.Write("Inserted Successfully");
        }
        catch (SqlException ex)
        {
            Response.Write("SQL ERROR " + ex.Message);
        }
    }
}