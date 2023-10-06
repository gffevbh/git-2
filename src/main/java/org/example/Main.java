package org.example;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        sayHello(System.out);
    }

    public static void sayHello(PrintStream out) {
        out.print("Hello, world!");
    }
}