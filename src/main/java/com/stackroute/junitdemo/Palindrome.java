/*
Write a program which accepts a number as input and check whether the given number is
palindrome or not If it is a palindrome then
a. Add all the even numbers and check whether the sum is more than 25.
b. Print success and failure messages for all 3 conditions
Input : 2468642
Output : 2468642 is palindrome and the sum of even numbers is greater than 25
Input: 12345
Output: 12345 is not palindrome
Input: 12345654321
Output : 12345654321 is palindrome and sum of even numbers is less than 25
 */
package com.stackroute.junitdemo;

public class Palindrome {
    public static String palindrome(long number)
    {
        long temp,reverse=0,remainder,count=0,remainder1;
        temp=number;// story copy of number into temporary variable
        while(number!=0) //logic for palindrome
        {
            remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        if(reverse==temp)
        {
            while (temp!= 0)
            {
                remainder1 = temp % 10; //finding sum of even number in palindrome
                if (remainder1 % 2 == 0)
                {
                    count = count + remainder1;
                }
                temp = temp / 10;
            }
            if (count > 25)
            {
                return "The number is palindrome and greater than 25";

            }
            else
            {
                return "The number is palindrome and less than 25";
            }
        }
        else{

            return "The number is not a palindrome";
        }
    }

}


