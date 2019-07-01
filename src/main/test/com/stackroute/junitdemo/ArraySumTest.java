package com.stackroute.junitdemo;

import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraySumTest {
    ArraySum arraySum;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        arraySum = null;

    }

    @Test
    public void givenNumbersShouldReturnSumOfEven(){
        //arrange
        ArraySum arraySum=new ArraySum();
        //Act
        int result= arraySum.arraysum(3,new int[]{12,12,12});
        //Assert
        assertEquals(36,result);
    }
    @Test
    public void givenNumbersAndAlphabetShouldReturnSumOfEvenbyAsciiValue(){
        //arrange
        ArraySum arraySum=new ArraySum();
        //Act
        int result= arraySum.arraysum(4,new int[]{'P',10,10,10});
        //Assert;
        assertEquals(110,result);
    }
    @Test
    public void givenSpecialCharactersShouldReturnSumOfEvenbyAsciiValue(){
        //arrange
        ArraySum arraySum=new ArraySum();
        //Act
        int result= arraySum.arraysum(4,new int[]{'&','@','#','%'});
        //Assert;
        assertNotEquals(12,result);
    }
}

