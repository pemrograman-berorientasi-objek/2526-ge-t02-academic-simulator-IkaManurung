package academic.driver; 
 
import academic.model.Student; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner; 
 
/** 
 * @author [Nama Anda/Ika Manurung - sesuai konteks sebelumnya] 
 * Driver untuk memproses data mahasiswa (Student). 
 */ 
public class Driver2 { 
    public static void main(String[] args) { 
        Scanner inputScanner = new Scanner(System.in); 
 
        while (true) { 
            String line = inputScanner.nextLine(); 
            if (line.equals("---")) { 
                break; 
            } 
 
            String[] segments = line.split("#"); 
            // Validasi sederhana: memastikan ada 4 segmen 
            if (segments.length == 4) { 
                String id = segments[0]; 
                String name = segments[1]; 
                String year = segments[2]; // Tahun dianggap sebagai String 
                String major = segments[3]; 
 
                Student student = new Student(id, name, year, major); 
                students.add(student); 
            } else { 
                System.err.println("Error: Invalid input format. Expected 4 segments separated by '#'. Skipping line: " + line); 
            } 
        } 
 
        inputScanner.close(); 
 
        // Mencetak semua data mahasiswa yang telah diproses 
        for (Student student : students) { 
            System.out.println(student.toString()); 
        } 
    } 
} 
