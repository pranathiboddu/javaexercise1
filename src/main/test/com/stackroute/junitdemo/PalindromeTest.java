package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public void setUp() {
    }
    @After
    public void tearDown() {
        palindrome = null;
    }
    @Test
    public void givenNumberShouldReturnPalindromeandLessthan25(){
        //arrange
        Palindrome palindrome=new Palindrome();
        //Act
        String result= palindrome.palindrome(1234321);
        //Assert
        assertEquals("The number is palindrome and less than 25",result);
    }
    @Test
    public void givenNumberShouldReturnPalindromeandGreaterthan25(){
        //arrange
        Palindrome palindrome=new Palindrome();
        //Act
        String result= palindrome.palindrome(66633666);
        //Assert
        assertNotEquals("The number is not a palindrome",result);
    }
    @Test
    public void givenNumberShouldReturnNotaPalindrome(){
        //arrange
        Palindrome palindrome=new Palindrome();
        //Act
        String result= palindrome.palindrome(4658968);
        //Assert
        assertEquals("The number is not a palindrome",result);
    }

}