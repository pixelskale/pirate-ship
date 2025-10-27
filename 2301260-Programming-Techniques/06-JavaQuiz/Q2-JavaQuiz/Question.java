public class Question {
    private String text;
    private String answer;
    public Question() {}
    public Question(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public String getAnswer() {
        return answer;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public boolean checkAnswer(String response) {
        if (response.equals(this.getAnswer())) { return true; }
        else { return false; }
    }
    public void display() { System.out.println(this.getText()); }
}
