package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
       try{ secondChallenge.probablyIWillThrowException(3,1.5);}
       catch(Exception e) {System.out.println("There was some problem...");}


    }
}
