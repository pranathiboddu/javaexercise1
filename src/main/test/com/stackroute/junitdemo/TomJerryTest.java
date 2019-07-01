package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class TomJerryTest {
    TomJerry tomJerry;
    @Before
    public void setUp() {

    }
    @After
    public void tearDown(){
        tomJerry=null;

    }

    @Test
    public void givenNumberShouldReturnTom(){
        //arrange
        TomJerry tomJerry=new TomJerry();
        //Act
        String result= tomJerry.condition(21);
        //Assert
        assertEquals("Tom",result);
    }
    @Test
    public void givenNumberShouldReturnJerry(){
        //arrange
        TomJerry tomJerry=new TomJerry();
        //Act
        String result= tomJerry.condition(22);
        //Assert
        assertEquals("Jerry",result);
    }
    @Test
    public void givenNumberShouldReturnError(){
        //arrange
        TomJerry tomJerry=new TomJerry();
        //Act
        String result= tomJerry.condition(32);
        //Assert
        assertEquals("error-out of range",result);
    }

}