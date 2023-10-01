import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class classroomTest {
    private classroom classroom;

    @BeforeEach
    public void setUp() {
        classroom = new classroom();
    }

    @Test
    public void testAdd() {
        assertEquals(5, classroom.add(2, 3));
        assertEquals(-1, classroom.add(2, -3));
        assertEquals(0, classroom.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, classroom.subtract(3, 2));
        assertEquals(5, classroom.subtract(2, -3));
        assertEquals(0, classroom.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, classroom.multiply(2, 3));
        assertEquals(-6, classroom.multiply(2, -3));
        assertEquals(0, classroom.multiply(0, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, classroom.divide(6, 3), 0.001);
        assertEquals(-2.0, classroom.divide(-6, 3), 0.001);

        assertThrows(ArithmeticException.class, () -> {
            classroom.divide(5, 0);
        });
    }

    @Test
    public void testFindMax() {
        assertEquals(5, classroom.findMax(3, 5));
        assertEquals(2, classroom.findMax(2, 2));
        assertEquals(-1, classroom.findMax(-1, -5));
    }
}
