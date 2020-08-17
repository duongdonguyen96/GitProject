import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void add1And1() {

        int result = SimpleCalculator.add(1, 1);
        assertEquals(2, result);
    }

    @Test
    void addNagative2And1() {
        int result = SimpleCalculator.add(-2, 1);
        assertEquals(-1, result);
    }

    @Test
    void add0And1() {

        int result = SimpleCalculator.add(0, 1);
        assertEquals(1, result);
    }

    @Test
    void add1And0() {
        int result = SimpleCalculator.add(1, 0);
        assertEquals(1, result);
    }

    @Test
    void sub1And0() {
        int result = SimpleCalculator.sub(1, 0);
        assertEquals(1, result);
    }

    @Test
    void sub1And1() {
        int result = SimpleCalculator.sub(1, 1);
        assertEquals(0, result);
    }

    @Test
    void sub1And2() {
        int result = SimpleCalculator.sub(1, 2);
        assertEquals(-1, result);
    }

    @Test
    void sub1And3() {
        int result = SimpleCalculator.sub(1, 3);
        assertEquals(-2, result);
    }
}