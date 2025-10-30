import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class RPSLogic {

    public static String[] choices = {"rock", "paper", "scissors"};
    public String validateInput() {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice: (rock,paper,scissors): ");
        String playerChoice = input.nextLine().toLowerCase();

        if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
            System.out.println("Enter one of the choices above: ");
        }
        return playerChoice;
    }
}

    public String validateCOmputer(){
        Random random = new Random();
        int index = random.nextInt(3);
        return RPSLogic.choices[index];
        }

void main() {
}











