import java.util.ArrayList;

public class ChoiceQuestion extends Question {
    private ArrayList<String> choices = new ArrayList<String>();
    public ChoiceQuestion() {
        super();
    }
    public ChoiceQuestion(String text) {
        super();
        this.setText(text);
    }
    public void addChoice(String choice) {
        this.choices.add(choice);
    }
    public void addChoice(String choice, boolean correct) {
        this.choices.add(choice);
        if (correct) { this.setAnswer(choice); }
    }
    @Override
    public void display() {
        System.out.println(this.getText());
        for (int i = 0; i < this.choices.size(); i++) {
            System.out.printf("%d: %s%n", i+1, this.choices.get(i));
        }
    }
    @Override
    public boolean checkAnswer(String response) {
        if (choices.get(Integer.parseInt(response)-1).equals(this.getAnswer())) { return true; }
        else { return false; }
    }
}
