package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class DefinecharacterTest {
    Definecharacter definecharacter;
    @Before
    public void setUp() {
    }
    @After
    public void tearDown(){
        definecharacter=null;

    }
    @Test
    public void givenStringsShouldReturnUppercase(){
        //arrange
        Definecharacter definecharacter=new Definecharacter();
        //Act
        String result= definecharacter.character('A');
        //Assert
        assertEquals("uppercase",result);
    }
    @Test
    public void givenStringsShouldReturnLowercase(){
        //arrange
        Definecharacter definecharacter=new Definecharacter();
        //Act
        String result= definecharacter.character('a');
        //Assert
        assertEquals("lowercase",result);
    }
    @Test
    public void givenStringsShouldReturnSpecialSymbol(){
        //arrange
        Definecharacter definecharacter=new Definecharacter();
        //Act
        String result= definecharacter.character('@');
        //Assert
        assertEquals("special symbol",result);
    }
    @Test
    public void givenStringsShouldReturnDigit(){
        //arrange
        Definecharacter definecharacter=new Definecharacter();
        //Act
        String result= definecharacter.character('9');
        //Assert
        assertEquals("digit",result);
    }

}