import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void nextDayCalculator1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String result = NextDayCalculator.NextDayCalculator(day, month, year);
        assertEquals(2 + "-" + 1 + "-" + 2018, result);
    }

    @Test
    void nextDayCalculator2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String result = NextDayCalculator.NextDayCalculator(day, month, year);
        assertEquals(1 + "-" + 2 + "-" + 2018, result);
    }

    @Test
    void nextDayCalculator3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String result = NextDayCalculator.NextDayCalculator(day, month, year);
        assertEquals(1 + "-" + 5 + "-" + 2018, result);
    }

    @Test
    void nextDayCalculator4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String result = NextDayCalculator.NextDayCalculator(day, month, year);
        assertEquals(1 + "-" + 3 + "-" + 2018, result);
    }

    @Test
    void nextDayCalculator5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String result = NextDayCalculator.NextDayCalculator(day, month, year);
        assertEquals(1 + "-" + 3 + "-" + 2020, result);
    }

    @Test
    void nextDayCalculator6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String result = NextDayCalculator.NextDayCalculator(day, month, year);
        assertEquals(1 + "-" + 1 + "-" + 2019, result);
    }
}
