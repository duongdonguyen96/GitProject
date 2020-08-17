import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void checkNumber6() {
        String result = FizzBuzzTranslate.checkNumber(6);
        String expected = "Fizz";
        assertEquals(expected, result);
    }

    @Test
    void checkNumber10() {
        String result = FizzBuzzTranslate.checkNumber(10);
        String expected = "Buzz";
        assertEquals(expected, result);
    }

    @Test
    void checkNumber15() {
        String result = FizzBuzzTranslate.checkNumber(15);
        String expected = "FizzBuzz";
        assertEquals(expected, result);
    }

    @Test
    void checkNumber7() {
        String result = FizzBuzzTranslate.checkNumber(7);
        String expected = "7";
        assertEquals(expected, result);
    }
}