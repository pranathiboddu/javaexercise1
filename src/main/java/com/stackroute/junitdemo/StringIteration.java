/*
Write a program for the following condition:
Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
repeat n number of times in the output String.
Input1: Stackroute
Input2: 5
Output1: Stackrouterouterouterouterouteroute

Input1: Stackroute
Input2: 2
Output1: Stackroutetete
 */
package com.stackroute.junitdemo;

import java.util.Scanner;

public class StringIteration {

    public static String stringiteration(String word, int number) //initialized string and number to repeat that many times
    {
        int count = 0;
        String result = "";
        String finalstring = "";
        char c;
        if(number<=word.length())
        {
            while (count != number)
            {
                for (int i = word.length() - number; i < word.length(); i++) //getting last number of characters to iterate
                {
                    c = word.charAt(i);
                    result = result + c;
                }
                count++;
            }
            finalstring = finalstring + word.concat(result);
            return finalstring;
        }

        else
        {
            return "out of bound";
        }
    }

}
