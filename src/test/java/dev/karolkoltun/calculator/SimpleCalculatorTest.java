package dev.karolkoltun.calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    private SimpleCalculator simpleCalculator;

    @BeforeEach
    void setup() {
        simpleCalculator = new SimpleCalculator();
    }

    @Test
    public void testAdd() {
        //Given
        int x = 33;
        int y = 9;
        //When
        int result = simpleCalculator.add(x, y);
        //Result
        assertEquals(42, result);
    }

    @Test
    public void testMultiply() {
        int result = simpleCalculator.multiply(4, 6);

        assertEquals(32, result);
    }

    @Test
    public void testSubtract() {
        int result = simpleCalculator.subtract(1231, 432342);

        assertEquals(0, result);
    }

    @Test
    public void testFibonacci() {
        int result = simpleCalculator.calculateFibonacci(5);

        assertEquals(5, result);
    }

}