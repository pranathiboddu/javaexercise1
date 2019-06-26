package com.stackroute.junitdemo;



public class ArraySum {
    public static int arraysum(int number, int array[]) {
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