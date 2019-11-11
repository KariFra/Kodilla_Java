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
    public static void afterAllSuit(){
        System.out.println("All tests have been executed.");
    }

    @Test
    public void testAddFigure(){
        //Given
        Shape circle = new Circle("circle", 20.00);
        ShapeCollector collectedShape = new ShapeCollector();

        //When
        ArrayList<Shape> result = collectedShape.addFigure(circle);

        //Then
        Assert.assertEquals(1,result.size());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        Shape circle = new Circle("circle", 20.00);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        ShapeCollector collectedShape = new ShapeCollector();

        //When
        boolean result = collectedShape.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
    }
    @Test
    public void TestGetFigure(){
        //Given
        Shape circle = new Circle("circle", 20.00);
        Shape triangle = new Triangle("triangle", 10.00);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(triangle);

        //When
        Shape result = shapes.get(0);


        //Then
        Assert.assertEquals(circle,result);
    }



}
