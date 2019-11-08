package com.kodilla.testing;

import com.kodilla.testing.Calculator.SimpleCalculator;
import com.kodilla.testing.User.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        SimpleUser simpleuser = new SimpleUser("ForumUser");

        String result = simpleuser.getUsername();

        if (result.equals("ForumUser")){
            System.out.println("Program works ok");
        } else {
            System.out.println("Error!");
        }
//Calculator testing

        SimpleCalculator calculator = new SimpleCalculator(5,2);

        int resultA = calculator.add();
        int resultS = calculator.substract();

        if (resultA == 7 && resultS == 3){
            System.out.println("Calculator works ok");
        } else {
            System.out.println("Error!");
        }

    }
}
