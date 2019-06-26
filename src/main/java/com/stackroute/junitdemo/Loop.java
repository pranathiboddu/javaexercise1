package com.stackroute.junitdemo;

public class Loop {
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
