package org.example.HelloWorld.testHelloWorld;
import org.example.Main;
import org.junit.Assert;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    private static ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    public static void main(String[] args) throws Exception {
        setUpStreams();
        testString();
        cleanUpStreams();
    }

    public static void setUpStreams(){
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    public static void testString() throws Exception {
        Main text = new Main();
        text.sayHello();
        try {
            Assert.assertEquals("Hello world!", byteArrayOutputStream.toString());
        } catch (AssertionError e) {
            System.err.println("Test failed");
        }
    }

    public static void cleanUpStreams() {
        System.setOut(null);
    }
}
