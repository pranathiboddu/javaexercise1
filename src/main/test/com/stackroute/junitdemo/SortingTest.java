package com.stackroute.junitdemo;

import org.junit.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting sort;
    @Before
    public void setUp() {
        System.out.println("Before");


    }
    @After
    public void tearDown(){
        System.out.println("After");
        sort=null;

    }
    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("BeforeClass");


    }
    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("AfterClass");


    }
    @Test
    public void givenNumberShouldReturnDescendingOrderAndSumOfEven(){
        //arrange
        Sorting sort=new Sorting();
        //Act
        int[] result= sort.sortingarray(4432656);
        //Assert
       assertEquals("[6654432, 22]", Arrays.toString(result));
    }

}