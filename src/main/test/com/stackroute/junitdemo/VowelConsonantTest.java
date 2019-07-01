package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelConsonantTest {

    VowelConsonant vowelConsonant;
    @Before
    public void setUp() {
    }
    @After
    public void tearDown(){
        vowelConsonant=null;
    }

    @Test
    public void givenStringShouldReturnVowelConsonant(){
        //arrange
        VowelConsonant vowelConsonant=new VowelConsonant();
        //Act
        String result= vowelConsonant.character("aB");
        //Assert
        assertEquals("VowelConsonant",result);
    }
    @Test
    public void givenStringShouldReturnConsonantConsonantVowel(){
        //arrange
        VowelConsonant vowelConsonant=new VowelConsonant();
        //Act
        String result= vowelConsonant.character("Pra");
        //Assert
        assertEquals("ConsonantConsonantVowel",result);
    }
    @Test
    public void givenStringShouldReturnConsonantVowelNotAlphabet(){
        //arrange
        VowelConsonant vowelConsonant=new VowelConsonant();
        //Act
        String result= vowelConsonant.character("pE*");
        //Assert
        assertEquals("ConsonantVowelNot a Alphabet",result);
    }

}