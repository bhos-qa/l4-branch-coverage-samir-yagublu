import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class classroom {

    // Method 1: Calculate the sum of two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Subtract one number from another
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method 3: Multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method 4: Divide one number by another
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    // Method 5: Check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method 6: Read sensitive data from a file without proper error handling (vulnerable to data leaks)
    public String readSensitiveDataFromFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String data = "";
        String line;
        while ((line = reader.readLine()) != null) {
            data += line;
        }
        reader.close();
        return data;
    }

    // Method 7: Execute an OS command without proper input validation (vulnerable to command injection)
    public void executeCommand(String command) throws IOException {
        Runtime.getRuntime().exec(command);
    }

    // Method 8: Store user profile data
    public void storeUserProfileData(String username, String email, int age) {
        // Normal code to store user profile data in a secure way, e.g., in a database
        System.out.println("Storing user profile data:");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
    }

    // Method 9: Encrypt sensitive data
    public String encryptData(String data) {
        // Normal code to encrypt sensitive data using a secure encryption algorithm
        // In this example, we'll use a simple Caesar cipher for illustration purposes.
        StringBuilder encrypted = new StringBuilder();
        int shift = 3; // Shift value for the Caesar cipher
        for (char c : data.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c + shift);
                if ((Character.isUpperCase(c) && shifted > 'Z') || (Character.isLowerCase(c) && shifted > 'z')) {
                    shifted = (char) (c - (26 - shift));
                }
                encrypted.append(shifted);
            } else {
                encrypted.append(c); // Leave non-letter characters unchanged
            }
        }
        return encrypted.toString();
    }

    public void redirectToExternalURL(String externalURL) throws IOException {
        // This is intentionally vulnerable code for educational purposes.
        // In a secure application, you should validate and sanitize external URLs.
        // Here, we'll simply perform the redirect without validation.
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + externalURL);
    }
}
