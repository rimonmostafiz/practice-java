package io.github.rimonmostafiz.junitbasics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    
    @Test
    void addTwoNumbers() {
        MathUtils mathUtils = new MathUtils();
        int actual = mathUtils.addTwoNumbers(0, 1);
        assertEquals(1, actual, "Should add two numbers");
    }
}
