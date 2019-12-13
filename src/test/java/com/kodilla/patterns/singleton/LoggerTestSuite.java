package com.kodilla.patterns.singleton;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
public class LoggerTestSuite {
    @BeforeClass
    public static void getLastLog() {
       Logger.getInstance().log("Last call 00001");
    }
    @Test
    public void testGetFileName() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last log: " + lastLog);
        //Then
        Assert.assertEquals("Last call 00001", lastLog);
    }
}
