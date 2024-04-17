using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class pr20 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        
    }
    protected void Calendar1_DayRender(object sender, DayRenderEventArgs e)
    {
        string Path = "D:/exam.txt";
        TableCell tc = e.Cell;
        string month = (e.Day.Date.Month).ToString();
        string day = (e.Day.Date.Day).ToString();
        string year = (e.Day.Date.Year).ToString();
        string fdate, subject, day1, month1, year1, input;
        if (!File.Exists(Path))
        {
            return;
        }
        else
        {
            StreamReader sr = File.OpenText(Path);
            while ((input = sr.ReadLine()) != null)
            {
                fdate = input.Substring(0, 10);
                subject = input.Substring(10);

                DateTime dt = Convert.ToDateTime(fdate);
                day1 = dt.Date.Day.ToString();
                month1 = dt.Date.Month.ToString();
                year1 = dt.Date.Year.ToString();

                if (day == day1 && month == month1 && year == year1)
                {  
                    Label l = new Label();
                    l.Text = subject;
                    l.BackColor = System.Drawing.Color.DarkBlue;
                    l.ForeColor = System.Drawing.Color.White;
                    tc.Controls.Add(new LiteralControl("<br/>"));
                    tc.Controls.Add(l);
                }
            }
        }
    }
}