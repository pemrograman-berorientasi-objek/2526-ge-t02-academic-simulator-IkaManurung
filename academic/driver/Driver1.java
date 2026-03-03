package academic.driver; 
 
import academic.model.Course; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner; 
 
/** 
 * @author 12S24021 Ika Maria 
 */ 
public class Driver1 { 
    public static void main(String[] args) { 
        Scanner inputScanner = new Scanner(System.in); 
        List<Course> courses = new ArrayList<Course>(); 
 
        while (true) { 
            String line = inputScanner.nextLine(); 
            if (line.equals("---")) { 
                break; 
            } 
 
            String[] segments = line.split("#"); 
            if (segments.length == 4) { 
                try { 
                    String code = segments[0]; 
                    String name = segments[1]; 
                    int credit = Integer.parseInt(segments[2]); 
                    String grade = segments[3]; 
 
                    Course course = new Course(code, name, credit, grade); 
                    courses.add(course); 
                } catch (NumberFormatException e) { 
                    System.err.println("Error: Credit must be a number. Skipping line: " + line); 
                } 
            } else { 
                System.err.println("Error: Invalid input format. Expected 4 segments separated by '#'. Skipping line: " + line); 
            } 
        } 
 
        inputScanner.close(); 
 
        for (Course course : courses) { 
            System.out.println(course.toString()); 
        } 
    } 
} 
