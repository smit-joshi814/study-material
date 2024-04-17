using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnsum_Click(object sender, EventArgs e)
        {
            System.Threading.Thread.Sleep(5000);

            int a = int.Parse(txtfirst.Text);
            int b = int.Parse(txtsecond.Text);

            int c = a + b;

            txtans.Text = c.ToString();
        }
    }
}