package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class TomJerryTest {
    TomJerryTest tj;
    @Before
    public void setUp() {
        System.out.println("Before");


    }
    @After
    public void tearDown(){
        System.out.println("After");
        tj=null;

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
    public void givenNumberShouldReturnTom(){
        //arrange
        TomJerry tj=new TomJerry();
        //Act
        String result= tj.condition(21);
        //Assert
        assertEquals("Tom",result);
    }
    @Test
    public void givenNumberShouldReturnJerry(){
        //arrange
        TomJerry tj=new TomJerry();
        //Act
        String result= tj.condition(22);
        //Assert
        assertEquals("Jerry",result);
    }
    @Test
    public void givenNumberShouldReturnError(){
        //arrange
        TomJerry tj=new TomJerry();
        //Act
        String result= tj.condition(32);
        //Assert
        assertEquals("error-out of range",result);
    }

}