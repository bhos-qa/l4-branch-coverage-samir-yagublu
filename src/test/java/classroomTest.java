import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class classroomTest {

    @Test
    public void testAdd() {
        classroom classroomInstance = new classroom();
        assertEquals(5, classroomInstance.add(2, 3));
        assertEquals(-1, classroomInstance.add(2, -3));
        assertEquals(0, classroomInstance.add(0, 0));
    }

    @Test
    public void testSubtract() {
        classroom classroomInstance = new classroom();
        assertEquals(1, classroomInstance.subtract(3, 2));
        assertEquals(5, classroomInstance.subtract(2, -3));
        assertEquals(0, classroomInstance.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        classroom classroomInstance = new classroom();
        assertEquals(6, classroomInstance.multiply(2, 3));
        assertEquals(-6, classroomInstance.multiply(2, -3));
        assertEquals(0, classroomInstance.multiply(0, 3));
    }

    @Test
    public void testDivide() {
        classroom classroomInstance = new classroom();
        assertEquals(2.0, classroomInstance.divide(6, 3), 0.001);
        assertEquals(-2.0, classroomInstance.divide(-6, 3), 0.001);

        assertThrows(ArithmeticException.class, () -> {
            classroomInstance.divide(5, 0);
        });
    }

    @Test
    public void testFindMax() {
        classroom classroomInstance = new classroom();
        assertEquals(5, classroomInstance.findMax(3, 5));
        assertEquals(2, classroomInstance.findMax(2, 2));
        assertEquals(-1, classroomInstance.findMax(-1, -5));
    }
}
