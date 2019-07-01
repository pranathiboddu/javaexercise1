/*
Write a program which accepts a number as input from user and perform the following:
a. sort the number in non-increasing order
b. after sorting sum all the even numbers, the sum should be greater than 15 .
c. if sum is more than 15,then print output as true or false.
Input : 234534
Output : Sorted number in non-increasing order : 544332

Sum of even numbers : 10
False
 */
package com.stackroute.junitdemo;

import org.junit.*;

import java.util.Arrays;

public class DigitSorting {
    public  int[] sortingarray(int input){
        int evensum = 0;
        int len = Integer.toString(input).length();
        int[] arr = new int[len];
        //spliting and placing each number into array
        for (int i = 0; i < len; i++) {
            arr[i] = input % 10;
            //finding even or odd(if even adding array and storing in evensum)
            if (arr[i] % 2 == 0) {
                evensum = evensum + arr[i];
            }
            input = input / 10;
        }
        //array sorting by default method
        Arrays.sort(arr);

        int number = 0;
        for (int i = 0; i < len; i++) {
            //reversing the array
            number = (number * 10) + arr[len - i - 1];
        }

        // System.out.println(" Sorted in descending order : " + number);
        //System.out.println("Sum of even numbers :" + evensum);
        //boolean var = (evensum > 15) ? true : false;
        ///System.out.println("Sum of even digits is more than 15 : " + var);
        return new int[]{number,evensum};
    }
}



