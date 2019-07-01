package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class NumberPatternTest {
    NumberPattern numberPattern;
    @Before
    public void setUp() {
    }
    @After
    public void tearDown(){
        numberPattern=null;

    }
    @Test
    public void givenNumberShouldReturnNumberPatter(){
        //arrange
        NumberPattern numberPattern=new NumberPattern();
        //Act
        String result= numberPattern.iteration(4);
        //Assert
        assertEquals("1223334444",result);
    }
    @Test
    public void givenNumberShouldReturnZero(){
        //arrange
        NumberPattern numberPattern=new NumberPattern();
        //Act
        String result= numberPattern.iteration(0);
        //Assert
        assertEquals("Entered zero",result);
    }
    @Test
    public void givenNumberShouldIterateFiveTimes(){
        //arrange
        NumberPattern numberPattern=new NumberPattern();
        //Act
        String result= numberPattern.iteration(-5);
        //Assert
        assertEquals("Entered negative number",result);
    }

}