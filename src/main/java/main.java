import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ScoreTracker human = new ScoreTracker(0, "Human");
        ScoreTracker computer = new ScoreTracker(0, "Computer");
        ScoreTracker tie = new ScoreTracker(0, "Tie");
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        int[] scores = {0, 0, 0};

        boolean continuePlay = true;

        while (continuePlay) {
            try {
                System.out.println("Make your choice - options: [rock, paper, scissors]");
                System.out.print(" : ");
                String choice = scanner.nextLine().toLowerCase();

                if (choice.equals("quit")) {
                    continuePlay = false;
                    break;
                }

                if (!(choice.equals("rock") || choice.equals("paper")|| choice.equals("scissors"))) {
                    System.out.println("Invalid input, please input the correct input:");
                    continue;
                }

                String machineChoice = choices[rand.nextInt(3)];

                String winner = RockPaperScissorsLogic.RPSResult(choice, machineChoice);
                if (winner == "machine") {
                    computer.incrementScore();
                } else if (winner == "player"){
                    human.incrementScore();
                } else {
                    tie.incrementScore();
                }

            }
            catch (Exception e) {
                System.out.println("error: " + e.getMessage());
            }
            System.out.printf("You: %d | Computer: %d | Ties: %d%n", human.getScore(), computer.getScore(), tie.getScore());

        }
        scanner.close();
    }
}
