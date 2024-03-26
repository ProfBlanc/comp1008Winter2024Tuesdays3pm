package wk11;

public class Course implements CourseStructure {

    String courseName;
    String courseCode;

    private int numAssignments;
    @Override
    public double getPassingGrade() {
        return 50;
    }

    @Override
    public String getSyllabus() {
        return "Welcome to " + courseCode + ": " + courseName;
    }

    @Override
    public int getAssignments() {
        return numAssignments;
    }

    @Override
    public double getAssignmentGrade(String assignment) {
        return switch (assignment.toLowerCase()){
            case "assignment1" -> 90;
            case "assignment2" -> 80;
            default -> 0;
        };
    }

    void blah(){}
}
