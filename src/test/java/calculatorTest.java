import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorTest {

    @Test
    public void testAdd() {
        int result = calculator.add(3, 5);
        // Assert that the result of add(3, 5) is equal to 8
        assertEquals(8, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(4, 6);
        // Assert that the result of multiply(4, 6) is equal to 24
        assertEquals(24, result);
    }
}
