using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            ArrayList list = new ArrayList();
            list.Add(10);
            list.Add(20);
            list.Add("String Here");
            list.Add(34.90);


            int []ar=new int[3];
            ar[0] = 10;
            ar[1] = 90;
            ar[2] = 50;

            list.InsertRange(2, ar);
            Console.WriteLine("====Displaying ArrayList====\n");

            foreach (object ob in list)
            {
                Console.Write("\t " + ob);
            }
            Console.WriteLine();
            Console.WriteLine("=>Modifying ArrayList\n");
            ar[0] = 100;
            ar[1] = 900;
            ar[2] = 10;


            list.SetRange(2, ar);
            
            Console.WriteLine("====Displaying Modifided ArrayList====");

            foreach (object ob in list)
            {
                Console.Write("\t " + ob);
            }
            Console.WriteLine();

            Console.WriteLine("\n=====Implementing HashTable=====\n");
            Hashtable hs = new Hashtable();
            hs.Add("1", "red"); 
            hs.Add("2", "blue");
            hs.Add("3", "white");

            foreach (object ob in hs.Keys)
            {
                Console.WriteLine("\ths[" +ob+"] = "+hs[ob]);
            }
            Console.WriteLine("Size Of HashTable Before Removing Element Is : " + hs.Count);
            Console.WriteLine("\nRemoving Eement From HashTable\n");
            hs.Remove("2");
            Console.WriteLine("Size Of Hash Table After Removin Elements Is : " + hs.Count);
            Console.WriteLine("\n\n=>HashTableAfter Removing Element");
            foreach (object ob in hs.Keys)
            {
                Console.WriteLine("\ths[" + ob + "] = " + hs[ob]);
            }

            Console.WriteLine();
            Console.WriteLine("Contains Value red ? "+hs.ContainsValue("red"));
            Console.WriteLine("Contains Key 2 ? " + hs.ContainsKey("2"));
            Console.WriteLine("Contsinskey 3 ?"+hs.Contains("3"));

            list.Reverse();
            Console.WriteLine("\n====List After Reversing=====");
            foreach(object ob in list) Console.WriteLine("\t"+ob);
        }
    }
}