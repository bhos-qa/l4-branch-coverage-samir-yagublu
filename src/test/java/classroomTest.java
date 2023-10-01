import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class classroomTest {

    private classroom classroom;

    @BeforeEach
    public void setUp() {
        classroom = new classroom();
    }

    @Test
    public void testAdd() {
        int result = classroom.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testMultiply() {
        int result = classroom.multiply(3, 4);
        assertEquals(12, result);
    }





}

