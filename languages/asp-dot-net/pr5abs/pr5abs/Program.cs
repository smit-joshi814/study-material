using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pr5abs
{
    //interface top push Elements In Stack
    interface Push_i
    {
       void Push(int x);
    }

    //interface to Pop Eements From stack
    interface Pop_i
    {
        int Pop();
    }


    //Implementing The Both Interfaces 
    class MyStack : Push_i,Pop_i
    {
        int top;
        int[]Myst;
        public MyStack()
        {
             top = -1;
             Myst= new int[10];
             Console.WriteLine("New Stack Created");
        }

        // This Method Will Push Elements In Stack
        public  void Push(int x)
        {
            if (top < Myst.Length)
            {
                Myst[++top] = x;
            }
            else
            {
                Console.WriteLine("Stack Overflow");
            }
        }

        // This Method Will PopELements From Stack
        public  int Pop()
        {
            return Myst[top--];
        }
    }

    //Abstrcat Class TaxCalculater
    abstract class TaxCalculater
    {
        protected double tax;
        protected double itemPrice;

        //Abstract Methoad
        public abstract double CalcTax();


        //Properties
        public double Tax
        {
            get
            {
                return tax;
            }
            set
            {
                tax = value;
            }
        }
        public double ItemPrice
        {
            get
            {
                return itemPrice;
            }
        }
    }


    // Inheriting TaxCalculator Class
    class MyClass : TaxCalculater
    {
        public MyClass(double Price)
        {
            this.itemPrice = Price;
          
        }

        //Overriding CalcTax And Calculating Tax
        public override double CalcTax()
        {
            this.Tax = 0.3 * itemPrice;
            return itemPrice + Tax;
        }
    }

    //Main Method Class
    class Program
    {
        static void Main(string[] args)
        {

            MyClass ob = new MyClass(100);
            Console.WriteLine("Item Price is " + ob.ItemPrice);
            
            //Calculating And Printing The Calculated Tax
            Console.WriteLine("The Tax Of Given Item is "+ob.CalcTax());

            Console.WriteLine("\n\n");


            //Creating Object Of MyStack Class
            MyStack st = new MyStack();

            //Inserting Elements In MyStack Class
            for (int i = 0; i < 10; i++) st.Push(i+1);
            
            //Printing Stack Using For lOOP
            Console.WriteLine("Printing Te stack");
            for(int i=0;i<10;i++) Console.WriteLine("st["+i+"] = "+ st.Pop());
        }
    }
}
