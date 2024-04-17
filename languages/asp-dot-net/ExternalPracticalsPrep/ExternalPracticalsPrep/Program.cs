using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ExternalPracticalsPrep
{
    class Program
    {
        static void main(string[] args)
        {
           //Delegate
            Console.WriteLine("Practical 1 Output...");
            Pr1 obj = new Pr1();
            obj.Result(30,20);

            //Jagged Array
            Console.WriteLine("\nPractical 2 Output...");
            Pr2 obj2= new Pr2();
            obj2.Result(5);

            //Event
            Console.WriteLine("\nPractical 3 Output...");
            Pr3 obj3 = new Pr3();
            obj3.Result();
                   
            //Inheritance
            Console.WriteLine("\nPractical 4 Output...");
            Pr4 obj4 = new Pr4();
            obj4.Result();

            //Abstraction & Interface
            Console.WriteLine("\nPractical 5 Output...");
            Pr5 obj5 = new Pr5();
            obj5.Result();

            //ArrayList & HashTable
            Console.WriteLine("\nPractical 6 Output...");
            Pr6 obj6 = new Pr6();
            obj6.Result();

            //Exception handling
            Console.WriteLine("\nPractical 7 Output...");
            Pr7 obj7 = new Pr7();
            obj7.Result();
        }
        //Practical 1
        class Pr1
        {
            delegate void myDel(int n1, int n2);

            public void Result(int n1,int n2)
            {
                myDel md = new myDel(add);
                md += new myDel(sub);
                md(n1,n2);
            }

            private void add(int n1,int n2)
            {
                Console.WriteLine("Sum is "+(n1+n2));
            }
            private void sub(int n1, int n2)
            {
                Console.WriteLine("Sub is " + (n1 - n2));
            }
        }
        //Practical 2
        class Pr2
        {
            public void Result(int size)
            {
                JaggedArray(size);
            }
            private void JaggedArray(int n)
            {
                string[][] arr = new string[n][];
                for (int i = 0; i <n; i++)
                {
                    arr[i] = new string[i + 1];
                    for (int j = 0; j <= i; j++)
                    {
                        arr[i][j] = " * ";
                    }
                }
                for (int i = 0; i < n; i++)
                {
                    for (int j = 0; j <= i; j++)
                    {
                        Console.Write(arr[i][j]);
                    }
                    Console.WriteLine();
                }
            }
        }
        //Practical 3
        class Pr3
        {
            delegate void myDel(object obj,EventArgs e);
            public void Result()
            {
                ClockTimer cl = new ClockTimer();
                cl.Timer += new myDel(Event1);
                cl.Timer += new myDel(Event2);
                cl.start();
            }

            private void Event1(object o,EventArgs e)
            {
                Console.WriteLine("Event 1 fired");
            }
            private void Event2(object o,EventArgs e)
            {
                Console.WriteLine("Event 2 fired");
            }

            class ClockTimer
            {
                public event myDel Timer;
                public void start()
                {
                    for (int i = 0; i < 2; i++)
                    {
                        Timer(this, null);
                        Thread.Sleep(1000);
                    }
                }
            }
        }
        //Practical 4
        class Pr4
        {
            class Demo1
            {
                public void  Display_Demo1(){
                    Console.WriteLine("Hello , From Demo 1");
                }
            }
            //Inheritance
            class Demo2 : Demo1
            {
                public void Display_Demo2()
                {
                    Console.WriteLine("Hello , From Demo 2");
                }
            }
            public void Result()
            {
                Console.WriteLine("Concept Of Inheritance");
                Demo2 obj = new Demo2();
                obj.Display_Demo1();
                obj.Display_Demo2();
            }
        }
        //Practical 5
        class Pr5
        {
            public void Result()
            {
                Implementer obj = new Implementer();
                obj.display();
                obj.display1();
                obj.display2();
                obj.sub(10, 20);
            }

            interface myIn
            {
                void display1();
                void display2();
            }
            abstract class myAbstrarct
            {
                public abstract void sub(int a, int b);
                public void  display(){
                    Console.WriteLine("Hello From Abstract Classe's Display");
                }
            }
            class Implementer : myAbstrarct, myIn
            {
                public void display1()
                {
                    Console.WriteLine("Display1 implemented #myIn Interface");
                }
                public void display2()
                {
                    Console.WriteLine("Display2 implemented #myIn Interface");
                }
                public override void sub(int a, int b)
                {
                    Console.WriteLine("Sub inplemenmted #myAbstract class");
                    Console.WriteLine("Sub is : " + (a - b));
                }
            }
        }
        //Practical 6
        class Pr6
        {
            public void Result()
            {
                //ArrayList
                ArrayList al = new ArrayList();
                al.Add(10);
                al.Add(20);
                al.Add(30);
                al.Add(40);
                Console.WriteLine("capacity of arrayList is " + al.Capacity);

                foreach (object o in al)
                {
                    Console.Write(" "+o);
                }
                Console.WriteLine("\n");

                //Hashtable

                Hashtable ht = new Hashtable();
                ht.Add("k1", "val1");
                ht.Add("k2", "val2");
                ht.Add("k3", "val3");
                ht.Add("k4", "val4");
                ht.Add("k5", "val5");

                Console.WriteLine("Hashtable Count : " + ht.Count);

                Console.WriteLine("Printing Hashtavble vlues");
                foreach (object o in ht.Keys)
                {
                    Console.WriteLine("ht[" + o + "] => " + ht[o]);
                }
                Console.WriteLine();
            }
        }
        //Practical 6
        class Pr7
        {
            public void Result()
            {
                myExp ex = new myExp();
                try
                {
                    ex.Devide(10, 0);
                }
                catch (InvalidArgsExceop e)
                {
                    Console.WriteLine(e.Message);
                }
                
            }
            class InvalidArgsExceop : ApplicationException
            {
                public InvalidArgsExceop() :base("Devide by Zero Error"){ }
                public InvalidArgsExceop(string msg) : base(msg) { }
            }
            class myExp
            {
                public void Devide(double a, double b)
                {
                    if (b == 0)
                    {
                        InvalidArgsExceop e = new InvalidArgsExceop("Deviding num by 0");
                        throw e;
                    }
                    double c = a / b;
                    Console.WriteLine("Ans is : " + c);
                }
            }
        }
    }
}