package dev.karolkoltun;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    void test1() {
        //Given
        String text = "String Utils Test";

        //When
        String result = StringUtils.chop(text);

        //Result
        assertEquals("String Utils Tes", result);

    }

    @Test
    void test2() {
        //Given
        String text = "String Utils Test";

        //When
        String result = StringUtils.replace(text, "Test", "Replace");

        //Result
        assertThat(result)
                .isEqualTo("String Utils Replace")
                .startsWith("String");

    }

    @Test
    void test3() {
        //Given
        String text = "Test string 123";

        //When
        String result = StringUtils.getDigits(text);

        //Result
        assertThat(result)
                .isEqualTo("123");
    }
}
