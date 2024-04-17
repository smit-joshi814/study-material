using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class p20 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Calendar1_DayRender(object sender, DayRenderEventArgs e)
    {
        string path = "d:/exam.txt";
        TableCell tc = e.Cell;
        string month1 = (e.Day.Date.Month).ToString();
        string year1 = e.Day.Date.Year.ToString();
        string day1 = (e.Day.Date.Day).ToString();
        string fdate = "";
        string subject = "";
        string day="", month="", year="";
        if (!File.Exists(path))
        {
            Response.Write("File not exists");
            return;
        }
       
            using (StreamReader sr = File.OpenText(path))
            {
                String input;
                while ((input = sr.ReadLine()) != null)
                {
                    fdate = input.Substring(0, 10);
                    subject = input.Substring(10);

                    DateTime dt = Convert.ToDateTime(fdate);
                    day = dt.Date.Day.ToString();
                    month = dt.Date.Month.ToString();
                    year = dt.Date.Year.ToString();
                    /*
                    // Response.Write(day + "\t" + month + "\t" + year);
                    //Response.Write(day1 + "\t" + month1 + "\t" + year1);
                    if (month1 == "10" && year1 == "2022")
                    {
                        Response.Write("<br/>day :" + day + "      " + "day1 :" + day1);
                        Response.Write("<br/>month :" + month + "      " + "month1 :" + month1);
                        Response.Write("<br/>year :" + year + "      " + "year1 :" + year1);
                    }
                     * */
                    if (day1 == day && month1 == month && year1 == year)
                    {
                        tc.Width = 100;
                        tc.Height = 50;
                        tc.BackColor = System.Drawing.Color.Yellow;
                        tc.Font.Size = 10;
                        tc.Font.Bold = true;
                        Label l = new Label();
                        l.Text = subject;
                        l.ForeColor = System.Drawing.Color.Green;
                        tc.Controls.Add(new LiteralControl("<br/>"));
                        tc.Controls.Add(l);
                    }
                }
            }
           
            if (e.Day.IsOtherMonth)
            {
                e.Cell.Text = "";
                e.Cell.BackColor = System.Drawing.Color.White;
            }
    }
}