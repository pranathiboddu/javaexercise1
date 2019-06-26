package com.stackroute.junitdemo;

import java.util.Scanner;

public class StringIteration {

    public static String stringiteration(String word, int number) {
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
