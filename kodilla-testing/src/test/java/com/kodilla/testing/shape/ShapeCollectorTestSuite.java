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
        Shape shape = new Shape("Triangle",12.00);
        ShapeCollector collectedShape = new ShapeCollector();

        //When
        ArrayList<Shape> result = collectedShape.addFigure(shape);

        //Then
        Assert.assertEquals(1,result.size());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        Triangle triangle = new Triangle("Triangle",12.00);
        ShapeCollector collectedShape = new ShapeCollector();
        ArrayList<Shape> shape = new ArrayList<>();
        shape.add(triangle);

        //When
        boolean result = collectedShape.removeFigure(triangle);

        //Then
        Assert.assertTrue(result);
    }
    @Test
    public int TestGetFigure(){
        //Given
        Triangle triangle = new Triangle("Triangle",12.00);
        ShapeCollector collectedShape = new ShapeCollector();
        collectedShape.addFigure(triangle);

        //When
        boolean result = collectedShape.removeFigure(triangle);

        //Then
        Assert.assertTrue(result);
    }



}
