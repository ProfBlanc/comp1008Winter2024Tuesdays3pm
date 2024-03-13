package wk9;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentCourseGradeOrganizer {
    static Scanner input = new Scanner(System.in);
    static Path path = Path.of("src/wk9");
    public static void main(String[] args) {
        try {
            welcome();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
    static void welcome() throws Exception{
        System.out.println("Welcome to our Student Course Grade Organizer");
        ArrayList<String> options = new ArrayList<>();
        options.add("add");
        options.add("delete");
        options.add("update");
        options.add("view");

        String message = "What would you like to do? Enter one " +
                "of the following options: ";
        for(String option : options){
            message += option + ", ";
        }
        message = message.substring(0, message.length() - 2);

        System.out.println(message);
        String choice = input.nextLine().toLowerCase();

        if(options.contains(choice)){
            switch (choice){
                case "add":
                    getInfo();
                    break;
                case "delete":
                    delete();
                    break;
                case "update":
                    update();
                    break;
                default:
                    view();
                    break;
            }
        }
    }
    static void view() throws Exception{
        String year = askQuestion(1);
        String semester = askQuestion(2);
        String courseCode = askQuestion(3);
        String evaluation = askQuestion(4);
        path = path.resolve(year)
                .resolve(semester)
                .resolve(courseCode)
                .resolve(evaluation + ".txt");
        if(Files.exists(path)){
            System.out.println("Grade for " + evaluation
                    + " of " +courseCode + " in " + year
                    + " " + semester + " is: " + Files.readString(path));

        }

    }
    static void delete() throws Exception{
        String year = askQuestion(1);
        String semester = askQuestion(2);
        String courseCode = askQuestion(3);
        String evaluation = askQuestion(4);

        path = path.resolve(year)
                .resolve(semester)
                .resolve(courseCode)
                .resolve(evaluation + ".txt");
        if(Files.exists(path)){
            Files.delete(path);
            System.out.println("Deletion successful");
        }
        else{
            System.out.println("Could not delete");
        }

    }
    static void update() throws Exception{
        String year = askQuestion(1);
        String semester = askQuestion(2);
        String courseCode = askQuestion(3);
        String evaluation = askQuestion(4);
        path = path.resolve(year)
                .resolve(semester)
                .resolve(courseCode)
                .resolve(evaluation + ".txt");

        System.out.println("Enter new grade");
        String grade = input.nextLine();
        Files.writeString(path, grade);

    }

    static String askQuestion(int number){
        String message = switch (number){
            case 1-> "Enter a year";
            case 2-> "Enter a semester";
            case 3-> "Enter course code or type quit to exit";
            default -> "Enter an evaluation";

        };
        System.out.println(message);
        return input.nextLine();
    }
    static void getInfo() throws Exception{
        String year = askQuestion(1);
        String semester = askQuestion(2);
        path = path.resolve(year).resolve(semester);
        if(!Files.exists(path)){
            Files.createDirectories(path);
        }

        while(true){
            String courseCode = askQuestion(3);
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
