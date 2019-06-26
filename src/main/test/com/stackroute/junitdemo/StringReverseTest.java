package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    @Test
    public void givenStringsShouldReverse(){
        //arrange
        StringReverse sr=new StringReverse();
        //Act
        String result= sr.reverse("Hello");
        //Assert
        assertEquals("olleH",result);
    }
    @Test
    public void givenStringsShouldReturnReverseWithMultipleSpaces(){
        //arrange
        StringReverse sr=new StringReverse();
        //Act
        String result= sr.reverse("Hello world  !");
        //Assert
        assertEquals("!  dlrow olleH",result);
    }

    @Test
    public void givenStringsShouldReturnReversealphanumeric() {
        //arrange
        StringReverse sr = new StringReverse();
        //Act
        String result = sr.reverse("1a2b3c");
        //Assert
        assertEquals("c3b2a1", result);
    }
    @Test
    public void givenStringsShouldReturnReverseEmptyString() {
        //arrange
        StringReverse sr = new StringReverse();
        //Act
        String result = sr.reverse("");
        //Assert
        assertEquals("", result);
    }
    @Test
    public void givenStringsShouldReturnReverseStringWithOneSpace() {
        //arrange
        StringReverse sr = new StringReverse();
        //Act
        String result = sr.reverse(" ");
        //Assert
        assertEquals(" ", result);
    }

    @Test
    public void givenStringsShouldReturnReverseStringSpecialCharacters() {
        //arrange
        StringReverse sr = new StringReverse();
        //Act
        String result = sr.reverse("@#$%^&*()");
        //Assert
        assertEquals(")(*&^%$#@", result);
    }
}