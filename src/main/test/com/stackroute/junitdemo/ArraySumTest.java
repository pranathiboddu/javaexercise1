package com.stackroute.junitdemo;

import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraySumTest {
    ArraySum as;

    @Before
    public void setUp() {
        System.out.println("Before");


    }

    @After
    public void tearDown() {
        System.out.println("After");
        as = null;

    }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("BeforeClass");


    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("AfterClass");


    }
    @Test
    public void givenNumbersShouldReturnSumOfEven(){
        //arrange
        ArraySum sum=new ArraySum();
        //Act
        int result= sum.arraysum(3,new int[]{12,12,12});
        //Assert
        assertEquals(36,result);
    }
    @Test
    public void givenNumbersAndAlphabetShouldReturnSumOfEvenbyAsciiValue(){
        //arrange
        ArraySum sum=new ArraySum();
        //Act
        int result= sum.arraysum(4,new int[]{'P',10,10,10});
        //Assert;
        assertEquals(110,result);
    }
    @Test
    public void givenSpecialCharactersShouldReturnSumOfEvenbyAsciiValue(){
        //arrange
        ArraySum sum=new ArraySum();
        //Act
        int result= sum.arraysum(4,new int[]{'&','@','#','%'});
        //Assert;
        assertEquals(174,result);
    }
}

