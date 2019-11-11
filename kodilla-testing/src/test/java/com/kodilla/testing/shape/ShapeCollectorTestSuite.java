package com.kodilla.testing.shape;

import java.lang.*;
import java.util.*;

import javafx.beans.binding.When;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @Before
    public void beforeEachTest(){
        testCounter ++;
        System.out.println("Preparing to execute test#"+testCounter);
    }

    @AfterClass
    public void afterAllSuit(){
        System.out.println("All tests have been executed.");
    }

    @Test
    public void testAddFigure(){
        //Given
        Triangle triangle = new Triangle("Triangle",12.00);


        //When
    }




}
