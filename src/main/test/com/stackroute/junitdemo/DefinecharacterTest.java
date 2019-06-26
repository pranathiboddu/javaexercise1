package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class DefinecharacterTest {
    DefinecharacterTest dc;
    @Before
    public void setUp() {
        System.out.println("Before");


    }
    @After
    public void tearDown(){
        System.out.println("After");
        dc=null;

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
    public void givenStringsShouldReturnUppercase(){
        //arrange
        Definecharacter dc=new Definecharacter();
        //Act
        String result= dc.character('A');
        //Assert
        assertEquals("uppercase",result);
    }
    @Test
    public void givenStringsShouldReturnLowercase(){
        //arrange
        Definecharacter dc=new Definecharacter();
        //Act
        String result= dc.character('a');
        //Assert
        assertEquals("lowercase",result);
    }
    @Test
    public void givenStringsShouldReturnSpecialSymbol(){
        //arrange
        Definecharacter dc=new Definecharacter();
        //Act
        String result= dc.character('@');
        //Assert
        assertEquals("special symbol",result);
    }
    @Test
    public void givenStringsShouldReturnDigit(){
        //arrange
        Definecharacter dc=new Definecharacter();
        //Act
        String result= dc.character('9');
        //Assert
        assertEquals("digit",result);
    }

}