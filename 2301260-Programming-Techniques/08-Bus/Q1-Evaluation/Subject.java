public class Subject implements Evaluation {
    private String subjName;
    private int[] score;
    public Subject(String subjName, int[] score) {
        this.subjName = subjName;
        this.score = score;
    }
    @Override
    public String toString() {
        return this.subjName;
    }
    @Override
    public double evaluate() {
        double scoreSum = 0;
        for (int i = 0; i < this.score.length; i++) {
            scoreSum += this.score[i];
        }
        return scoreSum/this.score.length;
    }
    @Override
    public char grade(double scoreSum) {
        if (scoreSum >= 70) { return 'P'; }
        else { return 'F'; }
    }
}
