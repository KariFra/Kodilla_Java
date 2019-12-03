package com.kodilla.exception.test;

import java.io.IOException;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws Exception {
        try { if(x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }

        } catch
        (IOException e) {throw new Exception();
        }
        finally{System.out.println("Error Error Error!");}

        return "Done!";
    }
}
