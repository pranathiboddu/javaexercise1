package com.stackroute.junitdemo;

public class App {
    public String concatAndConvertString(String str1, String str2) {
        if(str1.equals("") || str2.equals(""))
        {
            return "Null values are invalid";
        }
        String concatedString = str1.concat(str2);
        return concatedString.toUpperCase();
    }
}