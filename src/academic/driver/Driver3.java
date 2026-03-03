package academic.driver;

import academic.model.Enrollment;
import java.util.Scanner;
import java.util.LinkedList;

/**
 * @author 12S24021 Ika Maria
 */
public class Driver3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Enrollment> enrollments = new LinkedList<>();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            
            if (input.equals("---")) {
                break;
            }

            String[] data = input.split("#");
            
            // Enrollment butuh 4 data dari input: courseCode, nim, year, semester
            if (data.length == 4) {
                Enrollment enrollment = new Enrollment(data[0], data[1], data[2], data[3]);
                enrollments.add(enrollment); 
            }
        }
        
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment.toString());
        }
        
        scanner.close();
    }
}