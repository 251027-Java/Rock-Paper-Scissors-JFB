public class Ascii {

    public Ascii() {}

    public void playerOneChoice(String choice) {
        if (choice.equals("rock")) {
            System.out.print("""
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
""");
        } else if (choice.equals("paper")) {
            System.out.print("""
     _______
---'    ____)____
           ______)
          _______)
         _______)
---.__________)
""");
        } else if (choice.equals("scissors")) {
            System.out.print("""
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
""");
        }
    }

    public void space() {
        System.out.print("                          "    );
    }

    public void computerChoice(String choice) {

        if (choice.equals("rock")) {
            System.out.print("""
           _______
          (____   '---
         (_____)
         (_____)
          (____)
           (___)__.---
""");
        } else if (choice.equals("paper")) {
            System.out.print( """
               _______
          ____(____    '---
         (______
        (_______
         (_______
           (__________.---
""");
        } else if (choice.equals("scissors")) {
            System.out.print( """
           _______
          (____   '---
          (______
          (__________
               (____)
                (___)__.---
""");
        }
    }
}
