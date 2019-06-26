package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelConsonantTest {

    VowelConsonant vc;
    @Before
    public void setUp() {
        System.out.println("Before");


    }
    @After
    public void tearDown(){
        System.out.println("After");
        vc=null;

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
    public void givenStringShouldReturnVowelConsonant(){
        //arrange
        VowelConsonant vc=new VowelConsonant();
        //Act
        String result= vc.character("aB");
        //Assert
        assertEquals("VowelConsonant",result);
    }
    @Test
    public void givenStringShouldReturnConsonantConsonantVowel(){
        //arrange
        VowelConsonant vc=new VowelConsonant();
        //Act
        String result= vc.character("Pra");
        //Assert
        assertEquals("ConsonantConsonantVowel",result);
    }
    @Test
    public void givenStringShouldReturnConsonantVowelNotAlphabet(){
        //arrange
        VowelConsonant vc=new VowelConsonant();
        //Act
        String result= vc.character("pE*");
        //Assert
        assertEquals("ConsonantVowelNot a Alphabet",result);
    }

}