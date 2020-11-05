using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        List<string> sharpsList = new List<string>();
        /*char[,] sharpArray      = new char[n, n];
        for(int i = 0; i < n; i++)
        {   
            for(int j = 0; j < n; j++)
            {
                if(j < (n-i-1))
                    sharpArray[i, j] = '\0';
                else
                    sharpArray[i, j] = '#';
                Console.Write(string.Format("{0} ", sharpArray[i, j])); 
            }  
            Console.Write("\n");
        }*/
         for(int i = 0; i < n; i++)
        {   
            for(int j = 0; j < n; j++)
            {
                if(j < (n-i-1))
                    Console.Write(" ");
                else
                    Console.Write('#');
                
            }  
            Console.Write("\n");
        }
    }

    static void Main(string[] args) {
        int n = Convert.ToInt32(Console.ReadLine());

        staircase(n);
    }
}
