import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void add1And1() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int result = simpleCalculator.add(1, 1);
        assertEquals(2, result);
    }

    @Test
    void addNagative2And1() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int result = simpleCalculator.add(-2, 1);
        assertEquals(-1, result);
    }

    @Test
    void add0And1() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int result = simpleCalculator.add(0, 1);
        assertEquals(1, result);
    }

    @Test
    void add1And0() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int result = simpleCalculator.add(1, 0);
        assertEquals(1, result);
    }

    @Test
    void sub1And0() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int result = simpleCalculator.add(1, 0);
        assertEquals(1, result);
    }

    @Test
    void sub1And1() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int result = simpleCalculator.sub(1, 1);
        assertEquals(0, result);
    }

    @Test
    void sub1And2() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int result = simpleCalculator.sub(1, 2);
        assertEquals(-1, result);
    }

    @Test
    void sub1And3() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int result = simpleCalculator.sub(1, 3);
        assertEquals(-2, result);
    }
}