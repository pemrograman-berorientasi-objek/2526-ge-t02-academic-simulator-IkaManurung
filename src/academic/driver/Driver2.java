package academic.driver;

import academic.model.Student;
import java.util.Scanner;
import java.util.LinkedList;

/**
 * @author 12S24021 Ika Maria
 */
public class Driver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Student> students = new LinkedList<>();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            
            if (input.equals("---")) {
                break;
            }

            String[] data = input.split("#");
            
            if (data.length == 4) {
                Student student = new Student(data[0], data[1], data[2], data[3]);
                students.add(student); 
            }
        }
        
        for (Student student : students) {
            System.out.println(student.toString());
        }
        
        scanner.close();
    }
}