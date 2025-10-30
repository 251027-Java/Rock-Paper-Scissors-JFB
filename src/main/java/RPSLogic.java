import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class RPSLogic{

    public void Logic() {
    String[] choices = {"rock", "paper", "scissors"};

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your choice: (rock,paper,scissors): ");
    String playerChoice = input.nextLine().toLowerCase();

    if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
        System.out.println("Enter one of the choices above: ");
    }

    Random random = new Random();
    int index = random.nextInt(3);
    String computerChoice = choices[index];
    System.out.println("Computer chose: " + computerChoice);
    if(playerChoice.equals(computerChoice))
    {
        System.out.println("Its a draw!");
    }
    else if(  (playerChoice.equals("rock") && computerChoice.equals("scissors"))
            || (playerChoice.equals("paper") && computerChoice.equals("rock"))
            || (playerChoice.equals("scissors") && computerChoice.equals("paper"))
            )
    {
        System.out.println("Congrats you win!");
    }
    else
    {
        System.out.println("Computer wins!");
    }
    }


}
