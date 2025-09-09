// src/main/java/com/example/tests/MyFirstTest.java
package com.example.tests;

import org.testng.annotations.Test;

public class MyFirstTest {

    @Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        int sum = a + b;
        System.out.println("Sum: " + sum);
        assert sum == 8 : "Addition test failed!"; // Basic assertion
    }

    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 4;
        int difference = a - b;
        System.out.println("Difference: " + difference);
        assert difference == 6 : "Subtraction test failed!";
    }
}