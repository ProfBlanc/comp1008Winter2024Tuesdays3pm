package wk11;

public interface CourseStructure {
    double MAX_GRADE = 100, MIN_GRADE = 0;
    /*
    CourseStructure
    getPassingGrade
    getSyllabus
    getAssignments

     */
    double getPassingGrade();
    String getSyllabus();
    int getAssignments();
    double getAssignmentGrade(String assignment);
}
