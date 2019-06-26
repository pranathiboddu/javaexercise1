package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome p;
    @Before
    public void setUp() {
        System.out.println("Before");


    }
    @After
    public void tearDown(){
        System.out.println("After");
        p=null;

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
    public void givenNumberShouldReturnPalindromeandLessthan25(){
        //arrange
        Palindrome p=new Palindrome();
        //Act
        String result= p.palindrome(1234321);
        //Assert
        assertEquals("The number is palindrome and less than 25",result);
    }
    @Test
    public void givenNumberShouldReturnPalindromeandGreaterthan25(){
        //arrange
        Palindrome p=new Palindrome();
        //Act
        String result= p.palindrome(66633666);
        //Assert
        assertEquals("The number is palindrome and greater than 25",result);
    }
    @Test
    public void givenNumberShouldReturnNotaPalindrome(){
        //arrange
        Palindrome p=new Palindrome();
        //Act
        String result= p.palindrome(4658968);
        //Assert
        assertEquals("The number is not a palindrome",result);
    }

}