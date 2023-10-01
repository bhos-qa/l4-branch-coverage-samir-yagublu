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


    @Test
    public void testStoreUserProfileData() {
        // Define test data
        String username = "john_doe";
        String email = "john@example.com";
        int age = 30;

        // Call the method
        classroom.storeUserProfileData(username, email, age);

        // In a real application, you would typically store data in a database.
        // For testing purposes, you can add assertions to check if the data is stored correctly.
        // Here, we'll just print the data to the console.
        System.out.println("User Profile Data Stored:");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
    }


    @Test
    public void testExecuteCommand() {
        // Replace "echo 'Hello, World!'" with a safe test command.
        try {
            classroom.executeCommand("cmd.exe /c echo 'Hello, World!'");
            // Add assertions related to the expected behavior of the command if needed.
        } catch (IOException e) {
            fail("IOException occurred during the test: " + e.getMessage());
        }
    }

    @Test
    public void testEncryptData() {
        String originalData = "Hello";
        String encryptedData = classroom.encryptData(originalData);
        assertNotNull(encryptedData);
        // Add specific assertions related to the encryption if needed.
    }
}
