using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Jagged
{
    class Program
    {      
        static void Main(string[] args)
        {
            string[][] jag = new string[5][];
            for(int i=0;i < 5;i++){
                jag[i] = new string[i + 1];
                for (int j = 0; j <= i; j++)
                {
                    jag[i][j] = " *";
                }
            }

            for (int i = 0; i < 5; i++)
            {
                for (int j = 0; j <= i; j++)
                {
                    Console.Write(jag[i][j]);
                }
                Console.WriteLine();
            }
        }
    }
}