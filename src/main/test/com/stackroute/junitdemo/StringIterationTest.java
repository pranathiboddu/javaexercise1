package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class StringIterationTest {
    StringIteration si;
    @Before
    public void setUp() {
        System.out.println("Before");


    }
    @After
    public void tearDown(){
        System.out.println("After");
        si=null;

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
    public void givenStringShouldIterateTwoTimesWithLastTwoLetters(){
        //arrange
        StringIteration si=new StringIteration();
        //Act
        String result= si.stringiteration("abc",2);
        //Assert
        assertEquals("abcbcbc",result);
    }
    @Test
    public void givenStringShouldIterateThreeTimesWithLastThreeLetters(){
        //arrange
        StringIteration si=new StringIteration();
        //Act
        String result= si.stringiteration("pranathi@",3);
        //Assert
        assertEquals("pranathi@hi@hi@hi@",result);
    }
    @Test
    public void givenStringShouldIterateThreeTimesWithSpaces(){
        //arrange
        StringIteration si=new StringIteration();
        //Act
        String result= si.stringiteration("hello hi",4);
        //Assert
        assertEquals("hello hio hio hio hio hi",result);
    }
    @Test
    public void givenStringShouldReturnError(){
        //arrange
        StringIteration si=new StringIteration();
        //Act
        String result= si.stringiteration("stackroute",11);
        //Assert
        assertEquals("out of bound",result);
    }



}