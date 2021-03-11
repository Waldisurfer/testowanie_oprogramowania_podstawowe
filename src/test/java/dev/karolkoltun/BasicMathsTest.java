package dev.karolkoltun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicMathsTest {

    @Test
    public void shouldMultiplyNumbers() {
        int result = 2 * 4;

        Assertions.assertEquals(5, result);
    }
    @Test
    public void shouldMultiplyingZerosResultrsInZero() {
        int result = 0 * 213213212;

        Assertions.assertEquals(1, result);
    }
    @Test
    public void shouldBeEvenNumber() {
        int result = 353234 % 2;

        Assertions.assertEquals(0, result);
    }
    @Test
    public void shouldNotBeEvenNumber() {

        int result = 4324231 % 2;

        Assertions.assertNotEquals(0, result);
    }
    @Test
    public void shouldDivideNumbers_resultIsInt() {
        int result = 5 / 2;

        Assertions.assertEquals(2, result);
    }
    @Test
    public void shouldDivideNumbers_resultIsDouble() {
        double result = 0.2 + 0.1;

        Assertions.assertEquals(0.3, result, 0.0000000001);

    }

}
