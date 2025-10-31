import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ScoreTracker human = new ScoreTracker(0, "Human");
        ScoreTracker computer = new ScoreTracker(0, "Computer");
        ScoreTracker tie = new ScoreTracker(0, "Tie");
        Scanner scanner = new Scanner(System.in);

        Ascii ascii = new Ascii();

        Random rand = new Random();
        String[] choices = {"rock", "paper", "scissors"};

        while (true) {
            try {
                String machineChoice = choices[rand.nextInt(3)];
                System.out.println("Make your choice - options: [rock, paper, scissors] or quit");
                System.out.print("choice: ");
                String choice = scanner.nextLine().toLowerCase();
                ascii.playerOneChoice(choice);
                ascii.computerChoice(machineChoice);

                if (choice.equals("quit")) {
                    break;
                }

                if (!(choice.equals("rock") || choice.equals("paper")|| choice.equals("scissors"))) {
                    System.out.println("Invalid input, please input the correct input:");
                    continue;
                }



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
