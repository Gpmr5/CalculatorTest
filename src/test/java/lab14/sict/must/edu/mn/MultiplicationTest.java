package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    // Жишээ multiply арга: эерэг болон сөрөг тоог шалгана
    static class Multiplication {
        public int multiply(int a, int b) {
            if (a == 0 || b == 0) {
                return 0;
            } else if (a < 0 && b < 0) {
                return (-a) * (-b);
            } else if (a < 0 || b < 0) {
                return - (Math.abs(a) * Math.abs(b));
            } else {
                return a * b;
            }
        }
    }

    Multiplication multiplication = new Multiplication();

    @Test
    void testMultiplyPositive() {
        // 2 эерэг тоог үржүүлэх
        assertEquals(6, multiplication.multiply(2, 3));
    }

    @Test
    void testMultiplyWithZero() {
        // 0 оруулах нөхцөл
        assertEquals(0, multiplication.multiply(0, 5));
        assertEquals(0, multiplication.multiply(7, 0));
    }

    @Test
    void testMultiplyNegative() {
        // нэг эерэг, нэг сөрөг
        assertEquals(-15, multiplication.multiply(-3, 5));
        assertEquals(-15, multiplication.multiply(3, -5));
        // хоёулаа сөрөг
        assertEquals(12, multiplication.multiply(-3, -4));
    }
}
