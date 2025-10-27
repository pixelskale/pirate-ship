import java.lang.Math;
public class NumericQuestion extends Question {
    public NumericQuestion() {
        super();
    }
    public NumericQuestion(String text) {
        super();
        this.setText(text);
    }
    @Override
    public boolean checkAnswer(String response) {
        if (Math.abs(Double.parseDouble(response)-Double.parseDouble(this.getAnswer())) <= 0.01) { return true; }
        else { return false; }
    }
}
