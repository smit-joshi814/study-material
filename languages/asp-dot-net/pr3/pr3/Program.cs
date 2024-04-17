using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace pr3
{
    class Program
    {
        static void Main(string[] args)
        {
            Clock ct = new Clock();
            ct.Timer += new Mydel(ClickOne);
            ct.Timer += new Mydel(ClickTwo);
            ct.start();
        }
        public static void ClickOne(Object ob,EventArgs e)
        {
               Console.WriteLine("Click One Executed");
        }
        public static void ClickTwo(Object ob, EventArgs e)
        {
            Console.WriteLine("Click Two Executed");
        }

    }
    public delegate void Mydel(Object ob,EventArgs e);
    class Clock
    {
     public event Mydel Timer;

     public void start()
     {
         for (int i = 0; i < 5; i++)
         {
             Timer(this, null);
             Thread.Sleep(1000);
         }
      }
    }
}
