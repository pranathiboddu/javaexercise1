package com.stackroute.junitdemo;

public class TomJerry {

    public static String condition(int number)
    {

        if(number%2!=0 && (number>20 && number<30))// performing odd logic
        {
            return "Tom";
        }
       else if(number%2==0 && (number>20 && number<30))//performing even logic
        {
            return "Jerry";
        }
       else
        {
            return "error-out of range";
        }
    }
}
