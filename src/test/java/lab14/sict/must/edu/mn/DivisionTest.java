package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    Division division = new Division();

    @Test
    void testDividePositive() {
        // Эерэг тоонуудыг хуваах
        assertEquals(2, division.divide(6, 3));
        assertEquals(5, division.divide(25, 5));
    }

    @Test
    void testDivideNegative() {
        // Эерэг болон сөрөг
        assertEquals(-2, division.divide(-6, 3));
        assertEquals(-4, division.divide(12, -3));
        // Хоёулаа сөрөг
        assertEquals(3, division.divide(-9, -3));
    }

    @Test
    void testDivideByZero() {
        // 0-ээр хуваахыг шалгах
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            division.divide(5, 0);
        });
        assertEquals("Division by zero", exception.getMessage());
    }
}
