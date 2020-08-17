import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifieTest {

    @Test
    void checkTriangle222() {
        String result = TriangleClassifie.checkTriangle(2, 2, 2);
        assertEquals("Tam giac deu", result);
    }

    @Test
    void checkTriangle223() {
        String result = TriangleClassifie.checkTriangle(2, 2, 3);
        assertEquals("Tam giac can", result);
    }

    @Test
    void checkTriangle345() {
        String result = TriangleClassifie.checkTriangle(3, 4, 5);
        assertEquals("Tam giac thuong", result);
    }

    @Test
    void checkTriangle823() {
        String result = TriangleClassifie.checkTriangle(8, 2, 3);
        assertEquals("Khong phai tam giac", result);
    }

    @Test
    void checkTriangleNegative121() {
        String result = TriangleClassifie.checkTriangle(-1, 2, 1);
        assertEquals("Khong phai tam giac", result);
    }

    @Test
    void checkTriangle011() {
        String result = TriangleClassifie.checkTriangle(0, 1, 1);
        assertEquals("Khong phai tam giac", result);
    }
    @Test
    void checkTriangle113() {
        String result = TriangleClassifie.checkTriangle(1, 1, 3);
        assertEquals("Khong phai tam giac", result);
    }
}
