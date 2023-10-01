public class classroom {
    private String className;
    private int numberOfStudents;
    private boolean classIsOpen;

    public classroom(String className) {
        this.className = className;
        this.numberOfStudents = 0;
        this.classIsOpen = false;
    }

    // Method 1: Set the classroom name
    public void setClassName(String newName) {
        this.className = newName;
    }

    // Method 2: Get the classroom name
    public String getClassName() {
        return className;
    }

    // Method 3: Add a student to the classroom
    public void addStudent(String studentName) {
        numberOfStudents++;
    }

    // Method 4: Remove a student from the classroom
    public void removeStudent(String studentName) {
        numberOfStudents--;
    }

    // Method 5: Get the number of students in the classroom
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    // Method 6: Open the classroom (vulnerable to unauthorized access)
    public void openClassroom(String password) {
        if (password.equals("secretPassword123")) {
            classIsOpen = true;
            System.out.println("Classroom is now open.");
        } else {
            System.out.println("Incorrect password. Access denied.");
        }
    }

    // Method 7: Close the classroom (vulnerable to unauthorized access)
    public void closeClassroom(String password) {
        if (password.equals("secretPassword123")) {
            classIsOpen = false;
            System.out.println("Classroom is now closed.");
        } else {
            System.out.println("Incorrect password. Access denied.");
        }
    }

    // Method 8: Get the classroom's open/closed status
    public boolean isClassOpen() {
        return classIsOpen;
    }

    // Method 9: Vulnerable method - Execute a command without permission
    public void executeCommand(String command) {
        if (classIsOpen) {
            System.out.println("Executing command: " + command);
            // In a real-world scenario, this would be a security vulnerability.
        } else {
            System.out.println("Access denied. Classroom is closed.");
        }
    }

    // Method 10: Vulnerable method - Access sensitive data without proper authorization
    public String getSensitiveData(String dataName) {
        if (classIsOpen) {
            if (dataName.equals("grades")) {
                return "Student grades: ..."; // Insecure data access.
            } else {
                return "Access denied. Unknown data type.";
            }
        } else {
            return "Access denied. Classroom is closed.";
        }
    }
}
