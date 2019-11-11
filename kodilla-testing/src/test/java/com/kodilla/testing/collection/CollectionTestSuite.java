package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void before (){System.out.println("Test case begin");}
    @After
    public void after () {System.out.println("Test case end");}

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
         ArrayList<Integer> numbers = new  ArrayList<>();
         ArrayList<Integer> evenNumbers = new  ArrayList<>();
        //When
        numbers.clear();
        //Then
        Assert.assertTrue(evenNumbers.isEmpty());
        System.out.println("Test OddNumbersExterminatorEmptyList completed ");
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numbers = new  ArrayList<>();
        ArrayList<Integer> evenNumbers = new  ArrayList<>();
        //When
        numbers.add(22);
        numbers.add(31);
        //Than
        Assert.assertFalse(evenNumbers.contains(31) && !evenNumbers.contains(22));
        System.out.println("Test OddNumbersExterminatorNormalList completed ");
    }


}
