using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Data;

public partial class p13aspx : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {


    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        //connection
        SqlConnection cn = new SqlConnection(@"Data Source=(LocalDB)\v11.0;AttachDbFilename=D:\LEARNING\COLLAGE\SAM5\503\PRACTICALS\pr12\App_Data\Database.mdf;Integrated Security=True");
        //ahave ??  adapter   -- have ds
        SqlDataAdapter ad = new SqlDataAdapter("select *from Products", cn);
        DataSet ds = new DataSet();
        ad.Fill(ds, "product");
        // have ek khjali simple read karva mate

        ds.WriteXml(@"D:\LEARNING\COLLAGE\SAM5\503\pr13.xml"); //jop apde sidho path lakhie ne to agal  @ lakhavanu hoy che   have msg k thai gayu em
        Response.Write("Data Written Successfully");   //a thai gayu have read

      

        /// e gotal othai gayo connection khali write ma avse ne read ma khasli databind valu j
    }
    protected void Button2_Click(object sender, EventArgs e)
    {

        DataSet ds =new DataSet();
         // ama bahu barabar che khali jo dataset ne declare karvano che
        ds.ReadXml(@"D:\LEARNING\COLLAGE\SAM5\503\pr13.xml");  //path lakh koi b file jate banse .xml ni ok nam bokk
        GridView1.DataSource=ds.Tables["product"]; //bind kar run kaje ?
        GridView1.DataBind();
    }
}