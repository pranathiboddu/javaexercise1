package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class StringIterationTest {
    StringIteration stringIteration;
    @Before
    public void setUp() {
    }
    @After
    public void tearDown(){
        stringIteration=null;
    }
    @Test
    public void givenStringShouldIterateTwoTimesWithLastTwoLetters(){
        //arrange
        StringIteration stringIteration=new StringIteration();
        //Act
        String result= stringIteration.stringiteration("abc",2);
        //Assert
        assertEquals("abcbcbc",result);
    }
    @Test
    public void givenStringShouldIterateThreeTimesWithLastThreeLetters(){
        //arrange
        StringIteration stringIteration=new StringIteration();
        //Act
        String result= stringIteration.stringiteration("pranathi@",3);
        //Assert
        assertEquals("pranathi@hi@hi@hi@",result);
    }
    @Test
    public void givenStringShouldIterateThreeTimesWithSpaces(){
        //arrange
        StringIteration stringIteration=new StringIteration();
        //Act
        String result= stringIteration.stringiteration("hello hi",4);
        //Assert
        assertEquals("hello hio hio hio hio hi",result);
    }
    @Test
    public void givenStringShouldReturnError(){
        //arrange
        StringIteration stringIteration=new StringIteration();
        //Act
        String result= stringIteration.stringiteration("stackroute",11);
        //Assert
        assertEquals("out of bound",result);
    }



}