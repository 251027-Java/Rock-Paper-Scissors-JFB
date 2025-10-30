public class ScoreTracker {

    private int score;
    private String name;

    public ScoreTracker(int score, String name) {
        this.score = score;
        this.name = name;
    }
    public int getScore() {
       return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
