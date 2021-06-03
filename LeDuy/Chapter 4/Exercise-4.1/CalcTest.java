import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void testSubtract() {
        int a, b;
        a = 4;
        b = 2;
        assertEquals(2, Calc.subtract(a, b));
    }

    @Test
    void testMultiply() {
        int a, b;
        a = 4;
        b = 2;
        assertEquals(8, Calc.multiply(a, b));
    }

    @Test
    void testDivide() {
        int a, b;
        a = 4;
        b = 2;
        assertEquals(2, Calc.divide(a, b));
    }

    @AfterEach
    void tearDown() {
    }
}