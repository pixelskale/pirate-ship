public class Secretary extends Employee implements Evaluation {
    private int[] score;
    private int typingSpeed;
    public Secretary(String name, int salary, int[] score, int typingSpeed) {
        super(name, salary);
        this.score = score;
        this.typingSpeed = typingSpeed;
    }
    @Override
    public double evaluate() {
        double scoreSum = 0;
        for (int i = 0; i < this.score.length; i++) {
            scoreSum += this.score[i];
        }
        return scoreSum;
    }
    @Override
    public char grade(double scoreSum) {
        if (scoreSum >= 90) {
            setSalary(18000);
            return 'P';
        }
        else { return 'F'; }
    }
}
