package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class LoopTest {
    Loop loop;
    @Before
    public void setUp() {
        System.out.println("Before");


    }
    @After
    public void tearDown(){
        System.out.println("After");
        loop=null;

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
    public void givenNumberShouldReturnZero(){
        //arrange
        Loop loop=new Loop();
        //Act
        String result= loop.iteration(0);
        //Assert
        assertEquals("Entered zero",result);
    }
    @Test
    public void givenNumberShouldIterateFiveTimes(){
        //arrange
        Loop loop=new Loop();
        //Act
        String result= loop.iteration(-5);
        //Assert
        assertEquals("Entered negative number",result);
    }

}