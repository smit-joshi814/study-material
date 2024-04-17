using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class newpage : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        WebService w1 = new WebService();
        DataSet ds = w1.myData();
        Response.Write("<table cellspacing=1 cellpadding=10>");
        Response.Write("<tr><th>Pid</th><th>Pname</th><th>Cid</th></tr>");
        for (int i = 0; i < ds.Tables["Products"].Rows.Count; i++)
        {
            Response.Write("<tr><td>" + ds.Tables["Products"].Rows[i].ItemArray.GetValue(0).ToString() + "</td>");
            Response.Write("<td>" + ds.Tables["Products"].Rows[i].ItemArray.GetValue(1).ToString() + "</td>");
            Response.Write("<td>" + ds.Tables["Products"].Rows[i].ItemArray.GetValue(2).ToString() + "</td></tr>");
        }
        Response.Write("</table>");
    }
}