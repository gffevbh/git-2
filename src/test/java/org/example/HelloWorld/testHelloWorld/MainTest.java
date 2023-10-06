package org.example.HelloWorld.testHelloWorld;
import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {
    @Test
    public void testPrintHelloWorld() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        Main.sayHello(printStream);
        String outString = byteArrayOutputStream.toString();
        Assert.assertEquals("Hello, world!", outString);
    }
}
