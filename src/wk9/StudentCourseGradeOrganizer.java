package wk9;

import java.io.File;
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

        while(true){
            System.out.println("Enter a course code or quit to exit");
            String courseCode = input.nextLine();
            if(courseCode.trim().length() == 0 || courseCode.toLowerCase().charAt(0) == 'q')
                break;

            Files.createDirectory(path.resolve(courseCode));
        }
        String[] evaluations = {"assignment1", "mid-term"};
        for(File course : path.toFile().listFiles()){
            for(String evaluation : evaluations) {
                System.out.println(
                        String.format("Enter the grade for %s of %s %s semester for the course %s: ",
                                evaluation, year, semester, course.getName())
                );
                String grade = input.nextLine();

                Files.writeString(path.resolve(course.getName())
                        .resolve(evaluation + ".txt"), grade);
            }
        }
    }
}
