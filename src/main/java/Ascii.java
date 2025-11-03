public class Ascii {

    public Ascii() {}

    public void playerOneChoice(String choice) {
        String[] player = switch (choice) {
            case "rock" -> """
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
""".split("\n");
            case "paper" -> """
     _______
---'    ____)____
           ______)
          _______)
         _______)
---.__________)
""".split("\n");
            case "scissors" -> """
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
""".split("\n");
            default -> new String[]{""};
        };

        // store in static variable for display
        playerLines = player;
    }

    public void space() {
        System.out.print("                          ");
    }

    public void computerChoice(String choice) {
        String[] computer = switch (choice) {
            case "rock" -> """
    _______
   (____   '---
  (_____)
  (_____)
   (____)
    (___)__.---
""".split("\n");
            case "paper" -> """
      _____
 ____(____    '---
(______
(_______
 (_______
   (__________.---
""".split("\n");
            case "scissors" -> """
         _____
    ____(__ '---
   (______
   (__________
        (____)
         (___)__.---
""".split("\n");
            default -> new String[]{""};
        };

        // print both side by side (player + space + computer)
        for (int i = 0; i < playerLines.length; i++) {
            System.out.printf("%-35s%s%n", playerLines[i], computer[i]);
        }
    }

    // static variable to hold player ASCII lines
    private static String[] playerLines;

    // test main
    public static void main(String[] args) {
        Ascii art = new Ascii();
        art.playerOneChoice("rock");
        art.space();
        art.computerChoice("scissors");
    }
}
