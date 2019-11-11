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
         OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> result = exterminator.exterminate(numbers);

        //Then
        Assert.assertTrue(result.isEmpty());
        System.out.println("Test OddNumbersExterminatorEmptyList completed ");
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numbers = new  ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        numbers.add(31);
        numbers.add(22);

        //When musi sie znalezc wywolanie testowanej metody
        ArrayList<Integer> result = exterminator.exterminate(numbers);

        //Than
//        Assert.assertFalse(result.contains(31));
        ArrayList<Integer> expected = new  ArrayList<>();
        expected.add(22);
        Assert.assertEquals(expected,result);
        System.out.println("Test OddNumbersExterminatorNormalList completed ");
    }


}
