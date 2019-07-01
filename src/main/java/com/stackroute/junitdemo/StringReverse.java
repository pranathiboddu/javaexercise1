/*
Write a program to reverse any string without using String Buffer.
Input : london
Output : nodnol
 */
package com.stackroute.junitdemo;

public class StringReverse {
    public static String reverse(String originalString)//intialized  string
    {
        String temp = "";

        int length = originalString.length();

        for (int i = length - 1; i >= 0; i--) //logic for reverse of string
        {
            temp = temp + originalString .charAt(i);
        }

       return temp;
    }
}
