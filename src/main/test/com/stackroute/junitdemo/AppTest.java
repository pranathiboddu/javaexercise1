package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
    App app;
    @Before
    public void setUp() {
        System.out.println("Before");


    }
    @After
    public void tearDown(){
        System.out.println("After");
        app=null;

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
  public void givenTwoStringsShouldReturnConcatenatedString(){
        //arrange
      App app=new App();
        //Act
  String result= app.concatAndConvertString("Hello","World");
        //Assert
      assertEquals("HELLOWORLD",result);
    }
    @Test
    public void givenTwoNullStringsShouldReturnerrorMessage() {
        //arrange
        App app = new App();
        //Act
        String result =app.concatAndConvertString("", "");
        //Assert
        assertEquals("Null values are invalid",result);
    }

}