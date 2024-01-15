import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementSystem {
    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Add student");
            System.out.println("2. Display all students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        saveToCSV();
    }

    static void addStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        System.out.print("Enter student courses (comma-separated): ");
        String courses = scanner.next();

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setCourses(courses.split(","));

        students.add(student);
        System.out.println("Student added successfully!");
    }

    static void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    static void saveToCSV() {
        try (FileWriter fileWriter = new FileWriter("students.csv")) {
            fileWriter.write("Name,Age,Courses\n");
            for (Student student : students) {
                fileWriter.write(student.toString());
                fileWriter.write("\n");
            }
            System.out.println("Student data saved to CSV successfully!");
        } catch (IOException e) {
            System.out.println("Error saving to CSV: " + e.getMessage());
        }
    }
}