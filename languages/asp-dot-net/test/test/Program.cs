using System.Collections;

namespace test
{
    class studinfo
    {
        int roll;
        int s1;
        int s2;
        double per;
        int total;
        public studinfo(int roll,int s1,int s2)
        {
            this.roll = roll;
            this.s1 = s1;
            this.s2 = s2;
            this.total = s1 + s2;
            this.per =  total / 2 ;
        }
        public void ShowData()
        {
            Console.WriteLine("Roll No is: " + roll);
            Console.WriteLine("Marks of s1 is: " + s1);
            Console.WriteLine("Marks of s2 is: " + s2);
            Console.WriteLine("total is : "+total);
            Console.WriteLine("Percentage is : "+per);
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            List<studinfo> st = new List<studinfo>();
            Hashtable ht = new Hashtable();

            Console.WriteLine("How many studen's data You Want To Insert ");

            int n = Convert.ToInt32(Console.ReadLine());
            
            for(int i = 1; i <= n; i++)
            {
                Console.WriteLine("Enter data For Student "+i);
                Console.WriteLine("Enter Roll No"); int roll = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter S1: "); int s1 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter S2: "); int s2 = Convert.ToInt32(Console.ReadLine());


                ht.Add(i-1, roll);
                st.Add(new studinfo(roll,s1,s2));
            }
            Console.WriteLine("Press 1 for All Student data");
            Console.WriteLine("press 2 For Specific Student's Data");
            int choice = Convert.ToInt32(Console.ReadLine());

            if (choice == 1)
            {
                Console.WriteLine("Printing All Students data");
                for (int i = 0; i < n; i++)
                {
                    st[i].ShowData();
                }
            }
            else
            {
                Console.WriteLine("Which Student's data You Want To See ? Enter Roll No");
                
                int num = Convert.ToInt32(Console.ReadLine());
                if (ht.ContainsValue(num))
                {
                    for(int i = 0; i < n; i++)
                    {
                        if (num == Convert.ToInt32(ht[i]))
                        {
                            Console.WriteLine("The data Of Given Result is Shown below");
                            st[i].ShowData();
                        }
                    }
                }
                else
                {
                    Console.WriteLine("There is No Roll No in List Matching " + num);
                }
            }
        }
    }
}
//  CREATED BY SMIT JOSHI