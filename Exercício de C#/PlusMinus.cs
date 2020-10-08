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

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) 
    {
        int nzeros = 0;
        int nposit = 0;
        int nneg   = 0;

        foreach(int element in arr)
        {
            if(element == 0)    
                nzeros++;
            else if(element > 0)
                nposit++;
            else
                nneg++;
        }
        string rposit = ((float)nposit/arr.Length).ToString("F6");
        string rzeros = ((float)nzeros/arr.Length).ToString("F6");
        string rneg   = ((float)nneg/arr.Length).ToString("F6");
        
        Console.WriteLine(rposit + "\n" + rneg + "\n" + rzeros);
    }

    static void Main(string[] args) {
        int n = Convert.ToInt32(Console.ReadLine());

        int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp))
        ;
        plusMinus(arr);
    }
}
