import java.util.Random;
import java.util.Scanner;

public class Game {
    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    private int userScore=0;
    private int comScore=0;

    public void play() {
        String player;
        boolean playerWin;
        int playerNo, computer;
        int[] box = {Game.ROCK, Game.PAPER, Game.SCISSORS};
        Random generator = new Random();
        Scanner brother = new Scanner(System.in);
        while (true) {
            System.out.printf("Enter %d for ROCK, %d for PAPER, %d for SCISSORS: ", Game.ROCK, Game.PAPER, Game.SCISSORS);
            player = brother.nextLine();
            if (player.equals(Integer.toString(Game.ROCK)) || player.equals(Integer.toString(Game.PAPER)) || player.equals(Integer.toString(Game.SCISSORS))) {
                playerNo = Integer.parseInt(player);
                computer = box[generator.nextInt(box.length)];
                switch (playerNo) {
                    case Game.ROCK -> System.out.println("You enter: ROCK");
                    case Game.PAPER -> System.out.println("You enter: PAPER");
                    case Game.SCISSORS -> System.out.println("You enter: SCISSORS");
                }
                switch (computer) {
                    case Game.ROCK -> System.out.println("Computer: ROCK");
                    case Game.PAPER -> System.out.println("Computer: PAPER");
                    case Game.SCISSORS -> System.out.println("Computer: SCISSORS");
                }
                if (playerNo == computer) { System.out.println("It's a tie."); continue;}
                else if (playerNo == Game.ROCK) {playerWin = (computer == Game.SCISSORS);}
                else if (playerNo == Game.PAPER) {playerWin = (computer == Game.ROCK);}
                else {playerWin = (computer == Game.PAPER);}
                if (playerWin) {
                    System.out.println("You win!");
                    ++this.userScore;
                }
                else {
                    System.out.println("You lose!");
                    ++this.comScore;
                }
                if ((this.userScore-this.comScore) == 2) {
                    System.out.println("----------------------------------------");
                    System.out.println("Congrats! You win.");
                    System.out.println("User Score: " + this.userScore);
                    System.out.println("Computer Score: " + this.comScore);
                    break;
                }
                else if ((this.comScore-this.userScore) == 2) {
                    System.out.println("----------------------------------------");
                    System.out.println("Too bad! You lose.");
                    System.out.println("User Score: " + this.userScore);
                    System.out.println("Computer Score: " + this.comScore);
                    break;
                }
            }
        }
    }
}
