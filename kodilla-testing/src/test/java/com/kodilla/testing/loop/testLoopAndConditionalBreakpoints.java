package com.kodilla.testing.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testLoopAndConditionalBreakpoints {

    @Test
    public void testLoop(){
        //GIVEN
        long sum = 0;
        //WHEN

        for(int i = 0; i< 1000; i++){
            sum += i;
            System.out.println("["+i+"] Sum equals: "+ sum);
        }
        //Than
        assertEquals(499500,sum);
    }
}
