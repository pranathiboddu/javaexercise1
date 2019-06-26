package com.stackroute.junitdemo;

public class StringReverse {
    public static String reverse(String originalString)
    {
        String temp = "";

        int length = originalString.length();

        for (int i = length - 1; i >= 0; i--)
        {
            temp = temp + originalString .charAt(i);
        }

       return temp;
    }
}
