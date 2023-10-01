import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class classroomTest {
    private classroom classroomInstance;

    @BeforeEach
    public void setUp() {
        classroomInstance = new classroom("Math");
    }

    // Test Method 1: Set the classroom name
    @Test
    public void testSetClassName() {
        classroomInstance.setClassName("Science");
        assertEquals("Science", classroomInstance.getClassName());
    }

    // Test Method 3: Add a student to the classroom
    @Test
    public void testAddStudent() {
        classroomInstance.addStudent("John");
        assertEquals(1, classroomInstance.getNumberOfStudents());
    }

    // Test Method 6: Open the classroom (positive case)
    @Test
    public void testOpenClassroom() {
        classroomInstance.openClassroom("secretPassword123");
        assertTrue(classroomInstance.isClassOpen());
    }

    // Test Method 6: Open the classroom (negative case)
    @Test
    public void testOpenClassroomIncorrectPassword() {
        classroomInstance.openClassroom("wrongPassword");
        assertFalse(classroomInstance.isClassOpen());
    }

    // Test Method 9: Vulnerable method - Execute a command without permission
    @Test
    public void testExecuteCommand() {
        classroomInstance.openClassroom("secretPassword123");
        String result = captureSystemOut(() -> classroomInstance.executeCommand("ls -l"));
        assertTrue(result.contains("Executing command: ls -l"));
    }

    // Test Method 10: Vulnerable method - Access sensitive data without proper authorization
    @Test
    public void testGetSensitiveData() {
        classroomInstance.openClassroom("secretPassword123");
        String data = classroomInstance.getSensitiveData("grades");
        assertTrue(data.contains("Student grades"));
    }

    // Utility method to capture System.out.println output
    private String captureSystemOut(Runnable action) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            action.run();
            System.out.flush();
            return outputStream.toString();
        } finally {
            System.setOut(originalOut);
        }
    }
}
