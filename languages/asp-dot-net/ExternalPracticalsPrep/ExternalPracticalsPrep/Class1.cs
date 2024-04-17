using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExternalPracticalsPrep
{
    class StudentInfo
    {
        int RollNo;
        string Name;
        string FavouriteSubject;
        public StudentInfo(int rno, string name, string fvSub)
        {
            RollNo = rno;
            Name = name;
            FavouriteSubject = fvSub;
        }
        public void Display()
        {
            Console.WriteLine("Roll No: " + RollNo);
            Console.WriteLine("Name: " + Name);
            Console.WriteLine("Favouriate Subject: " + FavouriteSubject);
        }
    }
    class Class1
    {
        public static void Main(string[] args)
        {
            List<StudentInfo> st = new List<StudentInfo>();
            Hashtable ht = new Hashtable();
            int RollNo;
            string Name, FavouratieSubject;
            Console.Write("How Much Student's Informaction To Add ?");
            int choice;
            int iteration = Convert.ToInt32(Console.ReadLine());
            for (int i = 0; i < iteration; i++)
            {
                Console.Write("Enter RollNo: ");
                RollNo = Convert.ToInt32(Console.ReadLine());
                Console.Write("Enter Name: ");
                Name = Convert.ToString(Console.ReadLine());
                Console.Write("Enter Favouriate Subject: ");
                FavouratieSubject = Convert.ToString(Console.ReadLine());
                st.Add(new StudentInfo(RollNo, Name, FavouratieSubject));
                ht.Add(RollNo, i);
            }
            while (true)
            {
                Console.WriteLine("1. Print All Student's info");
                Console.WriteLine("2. Enter Roll No To Find Specific Element");
                Console.WriteLine("3. Exit");
                choice = Convert.ToInt32(Console.ReadLine());

                if (choice == 1)
                {
                    Console.WriteLine("\nPrinting Informaction");
                    for (int i = 0; i < st.Count; i++)
                    {
                        st[i].Display();
                    }
                }
                else if (choice == 2)
                {
                    int Find = Convert.ToInt32(Console.ReadLine());
                    if (ht.ContainsKey(Find))
                    {
                        st[Convert.ToInt32(ht[Find])].Display();
                    }
                    else
                    {
                        Console.Write("Informaction Dosen't Exist");
                    }
                }
                else if (choice == 3)
                {
                    break;
                }
            }
        }
    }
}
