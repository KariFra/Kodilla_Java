package com.kodilla.stream.array;


import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {


    static OptionalDouble getAverage(int[] numbers) {
        IntStream.rangeClosed(0,numbers[numbers.length-1] )
                .forEach(System.out::println);
        OptionalDouble average = IntStream.range(0,numbers.length )
                .map(n -> numbers[n])
                .average();
        return average;
    }
}
