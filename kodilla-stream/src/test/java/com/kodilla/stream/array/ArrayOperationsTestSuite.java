package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


import java.util.OptionalDouble;


public class ArrayOperationsTestSuite {


    @Test
    public void getAverageTest(){
        //Given
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        //When
        OptionalDouble average = ArrayOperations.getAverage(numbers);

        //Than
        Assert.assertEquals(9.50,average.getAsDouble(),0.01);





    }
}
