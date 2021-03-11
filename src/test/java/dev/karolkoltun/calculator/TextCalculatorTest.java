package dev.karolkoltun.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextCalculatorTest {

    TextCalculator calculator;

    @BeforeEach
    void setup() {
        calculator = new TextCalculator();
    }

    @Test
    void calculateAddition() {
        //Given
        double result = calculator.calculate("2+4");

        //Result
        assertEquals(6, result);
    }

    @Test
    void calculateSubtraction() {
        //Given
        double result = calculator.calculate("4-2");

        //Result
        assertEquals(2,result);

    }
}