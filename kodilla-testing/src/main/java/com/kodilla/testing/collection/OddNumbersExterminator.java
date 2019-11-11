package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {



        public static void main(String[] args) {

            Random theGenerator = new Random();


            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i=0; i<50 ; i++) {
                numbers.add(theGenerator.nextInt(50));
            }

        }
//    inicjalizuje arrayliste tylko na potrzeby metody

    ArrayList<Integer> exterminate (ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int i = 0; i<numbers.size(); i++ ){
            if( numbers.get(i) % 2 == 0 ) {evenNumbers.add(numbers.get(i));}
         }
        return evenNumbers;
    }


}


