package com.stackroute.junitdemo;

public class Definecharacter {

    public static String character(char ch){
        if (ch >= 65 && ch <= 96) {

            return "uppercase";
        }
        else if (ch >= 97 && ch <= 122)
        {
            return "lowercase";
        }
        else if (ch >= 48 && ch <= 57) {

            return "digit";
        }
        else {
            return "special symbol";
        }

    }
}
