package wk9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class StudentCourseGradeOrganizer {
    static Scanner input = new Scanner(System.in);
    static Path path = Path.of("src/wk9");;
    public static void main(String[] args) {
        welcome();
        try {
            getInfo();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
    static void welcome(){
        System.out.println("Welcome to our Student Course Grade Organizer");
    }
    static void getInfo() throws Exception{
        System.out.println("Enter the year");
        String year = input.nextLine();
        System.out.println("Enter the semester");
        String semester = input.nextLine();
        path = path.resolve(year).resolve(semester);
        if(!Files.exists(path)){
            Files.createDirectories(path);
        }
    }
}
