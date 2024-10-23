import java.io.*;
import java.util.*;

class Student {
    int studentId;
    String name;
    int rollNo;
    String studentClass;
    double marks;
    String address;

    Student(int studentId, String name, int rollNo, String studentClass, double marks, String address) {
        this.studentId = studentId;
        this.name = name;
        this.rollNo = rollNo;
        this.studentClass = studentClass;
        this.marks = marks;
        this.address = address;
    }

    @Override
    public String toString() {
        return studentId + "," + name + "," + rollNo + "," + studentClass + "," + marks + "," + address;
    }
}

public class StudentSearch {
    private static final String FILE_NAME = "students.txt";

    public static void createDatabase() throws IOException {
        List<Student> students = Arrays.asList(
                new Student(1, "Alice", 101, "10th", 95.0, "123 Main St"),
                new Student(2, "Bob", 102, "10th", 88.5, "456 Park Ave"),
                new Student(3, "Charlie", 103, "10th", 76.0, "789 Elm St")
        );

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student student : students) {
                writer.write(student.toString());
                writer.newLine();
            }
        }
    }

    public static void displayDatabase() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void searchRecord(int studentId) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (Integer.parseInt(parts[0]) == studentId) {
                    System.out.println("Record found: " + line);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Record not found for Student ID: " + studentId);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        createDatabase();
        System.out.println("Database created:");

        displayDatabase();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Student ID to search: ");
        int idToSearch = scanner.nextInt();
        searchRecord(idToSearch);

        scanner.close();
    }
}
