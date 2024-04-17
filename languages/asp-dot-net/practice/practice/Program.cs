// A simple delegate example.
using System;
// Declare a delegate type.
delegate void StrMod(string str);
class DelegateTest
{
    // Replaces spaces with hyphens.
    static void ReplaceSpaces(string s)
    {
        Console.WriteLine("Replacing spaces with hyphens.");
        Console.WriteLine(" " + s.Replace(' ', '-'));
    }
    // Remove spaces.
    static void RemoveSpaces(string s)
    {
        string temp = "";
        int i;
        Console.WriteLine("Removing spaces.");
        for (i = 0; i < s.Length; i++)
            if (s[i] != ' ') temp += s[i];
        Console.WriteLine(" " + temp);
    }
    // Reverse a string.
    static void Reverse(string s)
    {
        string temp = "";
        int i, j;
        Console.WriteLine("Reversing string.");
        for (j = 0, i = s.Length - 1; i >= 0; i--, j++)
            temp += s[i];
        Console.WriteLine(" " + temp);
    }
    static void Main()
    {
        // Construct a delegate.
        //Signle Casting
        StrMod strOp = new StrMod(RemoveSpaces);

        //MultiCasting
        strOp += new StrMod(Reverse);
        strOp += new StrMod(ReplaceSpaces);

        //kayu che aa?
        //are aa to delegate valu h assignment lakhto hato 
        //je karvu hoy e new banayi ne kar - -na tar jode database valu hoy ema new form o
        //ok

        strOp("Hello I'm Smit");

    }
}