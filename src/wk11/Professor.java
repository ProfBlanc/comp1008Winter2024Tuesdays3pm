package wk11;

public class Professor extends PublicSpeaker implements InteractiveActivity, Powerpoint {

    String name;

    public Professor(){}

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String title, double confidence, PublicSpeaker.CharismaLevels charisma, String name) {
        super(title, confidence, charisma);
        this.name = name;
    }

    @Override
    String speak(int pace, double clarity){
        return name + " is speaking at a pace of " + pace + ", with a clarity " +
                "of " + clarity;
    }

    @Override
    public int getParticipants() {
        return 0;
    }

    @Override
    public String displayResults() {
        return null;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public String getPrize(int rank) {
        return null;
    }

    @Override
    public void startPresentation() {

    }

    @Override
    public void endPresentation() {

    }

    @Override
    public int getNumberOfSlides() {
        return 0;
    }
}
