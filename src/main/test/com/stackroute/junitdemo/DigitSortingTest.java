package com.stackroute.junitdemo;

import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DigitSortingTest {
    DigitSorting sort;
    @Before
    public void setUp() {
    }
    @After
    public void tearDown(){
        sort=null;

    }

    @Test
    public void givenNumberShouldReturnDescendingOrderAndSumOfEven(){
        //arrange
        DigitSorting sort=new DigitSorting();
        //Act
        int[] result= sort.sortingarray(4432656);
        //Assert
        assertEquals("[6654432, 22]", Arrays.toString(result));
    }

}



