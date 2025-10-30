public class RockPaperScissorsLogic {
    public static String RPSResult(String player, String machine) {
//        player = player.toLowerCase();
    if (player.equals(machine)) {
        return "tie";
    }

    switch (player) {
        case "rock":
            return machine.equals("scissors") ? "player" : "machine";
        case "paper":
            return machine.equals("rock") ? "player" : "machine";
        case "scissors":
            return machine.equals("paper") ? "player" : "machine";
        default:
            return "Unknown";

    }

}

}

