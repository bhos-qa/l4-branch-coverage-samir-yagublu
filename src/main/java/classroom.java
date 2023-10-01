import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class classroom {
    public int add(int a, int b) {
        return a + b;
    }

    // Method for Subtracting Two Integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method for Multiplying Two Integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method for Dividing Two Integers
    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }

    // Method for Finding the Maximum of Two Integers
    public int findMax(int a, int b) {
        return Math.max(a, b);
    }

    // Method for Finding the Minimum of Two Integers
    public int findMin(int a, int b) {
        return Math.min(a, b);
    }

    // Method for Calculating the Square of an Integer
    public void excCommand(String new_dir){
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec(new String[]{"cmd.exe","/c","start"});

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Method for Checking if a Number is Even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method for Checking if a Number is Prime
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Vulnerable Method: File Reading with Inadequate Error Handling
    public String readFromFile(String filename) {
        String content = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                content += line;
            }
            br.close();
        } catch (IOException e) {
            // Inadequate error handling, potentially leaks sensitive information
            System.err.println("Error reading file: " + e.getMessage());
        }
        return content;
    }
}
