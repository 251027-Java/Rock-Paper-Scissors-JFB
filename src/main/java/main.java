import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        int[] scores = {0, 0, 0};

        boolean continuePlay = true;

        while (continuePlay) {
            try {
                String choice = scanner.nextLine().toLowerCase();

                if (choice.equals("quit")) {
                    continuePlay = false;
                    break;
                }

                if (!choice.equals("rock") ||choice.equals("paper")||choice.equals("scissors")) {
                    System.out.println("Invalid input, please input the correct input:");
                    continue;
                }

                String machineChoice = choices[rand.nextInt(3)];

                String winner = RockPaperScissorsLogic.RPSResult(choice, machineChoice);


            }
            catch (Exception e) {
                System.out.println("error: " + e.getMessage());
            }
            System.out.printf("You: %d | Computer: %d | Ties: %d%n", scores[0], scores[1], scores[2]);

        }
        scanner.close();
    }
}
