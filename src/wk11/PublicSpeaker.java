package wk11;

public abstract class PublicSpeaker {

    private String title;
    enum CharismaLevels{NONE, LITTLE, INTERMEDIATE, EXPERT }
    private double confidence;
    private CharismaLevels charisma = CharismaLevels.NONE;

    abstract String speak(int pace, double clarity);

    public PublicSpeaker(){}

    public PublicSpeaker(String title, double confidence, CharismaLevels charisma) {
            setTitle(title);
            setConfidence(confidence);
            setCharisma(charisma);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    public CharismaLevels getCharisma() {
        return charisma;
    }

    public void setCharisma(CharismaLevels charisma) {
        this.charisma = charisma;
    }
}
