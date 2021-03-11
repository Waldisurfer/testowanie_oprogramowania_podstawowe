package dev.karolkoltun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class StringTest {

    @Test
    public void testingStringAddition() {
        String a = "string";
        String b = "sum";
        String result = a + b;

        assertEquals("stringsum", result);
    }

    @Test
    public void testingStringToLowerCase() {
        String a = "STRING";
        String result = a.toLowerCase(Locale.ROOT);


        assertEquals("STRING", result);
    }

    @Test
    public void testingStringChangeInIndex() {
        String a = "string";
        String result = a.replace("s", "X");
        assertEquals("Xtring", result);
    }

    @Test
    public void testingStringRegexChange() {
        String result = "123Kar0ool".replaceFirst("[0-9]*","a");

        assertEquals("aKar0ool", result);
    }
    @Test
    public void testingStringStrip() {
        String result = "                              This is test string and it's fucking awesome".stripLeading();

        assertEquals("This is test string and it's fucking awesome", result);
    }
    @Test
    public void randomStringTesting() {
        String string = "This is test string";
        String bytes = string.getBytes().toString();

        System.out.println(bytes);
        assertEquals("[B@60438a68", bytes);

    }
    @Test
    public void testingStringToCharArray() {
        //Given
        String result = "Test string";
        //When
        char[] chars = result.toCharArray();

        //Result
     Assertions.assertArrayEquals(chars,chars);

    }
    @Test
    public void testingIsBlank() {
        //Given
        String string = "Jak";
        char[] given = {'J', 'a', 'k'};
        //When
    char[] actual = string.toCharArray();
        //Result
        Assertions.assertArrayEquals(given, actual);
    }
    @Test
    void isBlank() {
        //Given
        String string = "\t ";
        boolean given = string.isBlank();
        //When

        //Result
        Assertions.assertTrue(given);
        Assertions.assertEquals(true,given);
    }
    @Test
    void assertJ() {
        //Given
        String text = "Karol ma kota";

        //Then
        assertThat(text)
                .isEqualTo("Karol ma kota")
                .startsWith("Karol")
                .contains("ma")
                .endsWith("kota")
                .hasSize(13);

    }
    @Test
    void stringTestHomework34() {
        //Given
        String text = "Zadanie domowe";

        //When
        String given = text.repeat(3);

        //Result
        Assertions.assertEquals("Zadanie domoweZadanie domoweZadanie domowe", given);
    }
    @Test
    void stringTestHomework34_2(){
        //Given
        String text = "     Zadanie domowe        ";

        //When
        String result = text.strip().toUpperCase();
        System.out.println(result);

        //Result
        org.assertj.core.api.Assertions.assertThat(result)
                .endsWith("DOMOWE")
                .startsWith("ZADANIE")
                .contains(" ")
                .hasSizeGreaterThan(0)
                .doesNotContainAnyWhitespaces();  //fail bo zawiera spacje
    }

}

