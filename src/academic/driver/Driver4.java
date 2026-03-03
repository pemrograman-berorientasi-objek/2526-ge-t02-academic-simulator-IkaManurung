package academic.driver;

import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import java.util.Scanner;
import java.util.LinkedList;

/**
 * @author 12S24021 Ika Maria
 */
public class Driver4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // List untuk menampung masing-masing entitas
        LinkedList<Course> courses = new LinkedList<>();
        LinkedList<Student> students = new LinkedList<>();
        LinkedList<Enrollment> enrollments = new LinkedList<>();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            
            if (input.equals("---")) {
                break;
            }

            String[] data = input.split("#");
            String command = data[0];

            // Logika pemilihan entitas berdasarkan perintah di segmen awal
            if (command.equals("course-add") && data.length == 5) {
                courses.add(new Course(data[1], data[2], Integer.parseInt(data[3]), data[4]));
            } else if (command.equals("student-add") && data.length == 5) {
                students.add(new Student(data[1], data[2], data[3], data[4]));
            } else if (command.equals("enrollment-add") && data.length == 5) {
                enrollments.add(new Enrollment(data[1], data[2], data[3], data[4]));
            }
        }

        // Tampilkan semua Course
        for (Course c : courses) {
            System.out.println(c.toString());
        }
        // Tampilkan semua Student
        for (Student s : students) {
            System.out.println(s.toString());
        }
        // Tampilkan semua Enrollment
        for (Enrollment e : enrollments) {
            System.out.println(e.toString());
        }

        scanner.close();
    }
}