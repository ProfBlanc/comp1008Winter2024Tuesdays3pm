package wk11;

public class JuniorDeveloper implements ProgrammingRequirements{

    private int workExperience;

    enum EducationLevels{HIGH_SCHOOL, COLLEGE, UNIVERSITY, MASTERS, DOCTORAL};

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public int minWorkExperience(String title){
        return switch (title){
            case "junior"-> 3;
            case "mid"-> 5;
            default -> 8;
        };
    }
    @Override
    public String getMinEducation(String title) {
        //do something with title
        return EducationLevels.COLLEGE.name();
    }

    @Override
    public String getWorkingEnvironment() {
        return null;
    }
}
