using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pr5
{
    /*interface stack
    {
        void push(int val);
        int pop();
    }
     * 
     */

    abstract class MyClass
    {
      public abstract void display();
    }

    class B : MyClass
    {
         public override void display ()
        {
            Console.WriteLine("This Methoad is overloaded from");
        }
    }
    class Program 
    {
        static void Main(string[] args)
        {
            B ob = new B();
            ob.display();
        }
    }
}
