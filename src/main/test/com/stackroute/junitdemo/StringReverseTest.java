package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
   StringReverse stringReverse;
    @Before
    public void setUp() {
    }
    @After
    public void tearDown(){
        stringReverse=null;
    }

    @Test
    public void givenStringsShouldReverse(){
        //arrange
        StringReverse stringReverse=new StringReverse();
        //Act
        String result= stringReverse.reverse("Hello");
        //Assert
        assertEquals("olleH",result);
    }
    @Test
    public void givenStringsShouldReturnReverseWithMultipleSpaces(){
        //arrange
        StringReverse stringReverse=new StringReverse();
        //Act
        String result= stringReverse.reverse("Hello world  !");
        //Assert
        assertEquals("!  dlrow olleH",result);
    }

    @Test
    public void givenStringsShouldReturnReversealphanumeric() {
        //arrange
        StringReverse stringReverse = new StringReverse();
        //Act
        String result = stringReverse.reverse("1a2b3c");
        //Assert
        assertEquals("c3b2a1", result);
    }
    @Test
    public void givenStringsShouldReturnReverseEmptyString() {
        //arrange
        StringReverse stringReverse = new StringReverse();
        //Act
        String result = stringReverse.reverse("");
        //Assert
        assertEquals("", result);
    }
    @Test
    public void givenStringsShouldReturnReverseStringWithOneSpace() {
        //arrange
        StringReverse stringReverse = new StringReverse();
        //Act
        String result = stringReverse.reverse(" ");
        //Assert
        assertEquals(" ", result);
    }

    @Test
    public void givenStringsShouldReturnReverseStringSpecialCharacters() {
        //arrange
        StringReverse stringReverse = new StringReverse();
        //Act
        String result = stringReverse.reverse("@#$%^&*()");
        //Assert
        assertEquals(")(*&^%$#@", result);
    }
}