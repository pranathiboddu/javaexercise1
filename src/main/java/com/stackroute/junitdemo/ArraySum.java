/*
Write a program that reads an unspecified number of integer arguments using Scanner Class
and adds them together. The program should display total of the given input number and should
only consider integer value.The program should display an error message if there are any non
integer values
Input : 12 23 2 4
Output : 41
 */

package com.stackroute.junitdemo;
public class ArraySum {
    public static int arraysum(int number, int array[])//initalized number to enter number of elements
    {
        int count = 0;
        for (int i = 0; i < number; i++) {

            if (array[i] == (Integer.valueOf(array[i])))// checking integer value or not
            {
                count = count + array[i];
            }
        }
        return count;
    }
}