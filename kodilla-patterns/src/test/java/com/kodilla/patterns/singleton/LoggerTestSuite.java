package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void openLogger() {
        Logger.getInstance().log("log number one");
    }
    @Test
    public void testGetLastLog() {
        //Given

        //When
        String lastLog = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("log number one", lastLog);
    }
}
