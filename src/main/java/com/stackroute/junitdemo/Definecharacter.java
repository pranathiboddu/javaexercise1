/*
Write a program that takes a character from the user as input and determines whether the
character entered is a capital letter, a small case letter, a digit or a special symbol and display
appropriately.
Input: A
Output: Capital letter
 */
package com.stackroute.junitdemo;

public class Definecharacter {

    public static String character(char ch)//initialized character to check upper case or lowercase or digit or specialsymbol by ASCII values
    {
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
