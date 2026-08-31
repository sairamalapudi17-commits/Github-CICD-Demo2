import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, App.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, App.multiply(3, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, App.divide(10, 5));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            App.divide(10, 0);
        });
    }
}