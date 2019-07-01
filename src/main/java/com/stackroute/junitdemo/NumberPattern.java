/*
Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
6 6 . . . nth iteration.
Input: 5
Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
 */
package com.stackroute.junitdemo;

public class NumberPattern {
    public static String iteration(int number)
    {
        String result="";
        if(number>0) {
            for (int i = 1; i <= number; i++) // performing iteration starting from 1
            {
                for (int j = 1; j <= i; j++) // repetition
                {
                    result = result + i;
                }

            }
            return result;
        }
        else if(number==0)
        {
            return "Entered zero";
        }
        else
        {
            return "Entered negative number";
        }


    }
}