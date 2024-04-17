using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class pr16 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        showProducts();
    }

    private void showProducts()
    {
        string cmd = "SELECT * FROM tblProducts";
        WebService w = new WebService();
        DataSet ds = new DataSet();
        ds = w.GetResults(cmd);

        Response.Write("<table border='1'><tr><th>id</th><th>Product Name</th><th>cid</th></tr>");
        for (int i = 0; i < ds.Tables[0].Rows.Count; i++)
        {
            Response.Write("<tr>");
            for (int j = 0; j < ds.Tables[0].Columns.Count; j++)
            {
                Response.Write("<td>"+ds.Tables[0].Rows[i][j]+"</td>");
            }
            Response.Write("</tr>");
        }
        Response.Write("</table>");
    }
}