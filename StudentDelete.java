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

public class StudentDelete {
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

    public static void deleteRecord(int studentId) throws IOException {
        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.startsWith(String.valueOf(studentId))) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        }

        inputFile.delete();
        tempFile.renameTo(inputFile);
    }

    public static void main(String[] args) throws IOException {
        createDatabase();
        System.out.println("Database created:");

        displayDatabase();

        System.out.print("\nEnter Student ID to delete: ");
        Scanner scanner = new Scanner(System.in);
        int idToDelete = scanner.nextInt();
        deleteRecord(idToDelete);

        System.out.println("Database after deletion:");
        displayDatabase();

        scanner.close();
    }
}
