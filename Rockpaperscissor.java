import java.util.Scanner;
import java.util.Random;

public class Rockpaperscissor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        boolean playAgain = true;

        System.out.println("Welcome to Rock-Paper-Scissors!");

        while (playAgain) {
            System.out.println("\nEnter your choice (Rock, Paper, Scissors):");
            String playerChoice = scanner.nextLine().trim().toLowerCase();

             
            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
                continue;
            }

            
            playerChoice = playerChoice.substring(0, 1).toUpperCase() + playerChoice.substring(1).toLowerCase();

            
            int computerIndex = random.nextInt(3); // 0, 1, or 2
            String computerChoice = choices[computerIndex];

            System.out.println("You chose: " + playerChoice);
            System.out.println("Computer chose: " + computerChoice);

             
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                (playerChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                (playerChoice.equals("Scissors") && computerChoice.equals("Paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

             
            System.out.println("\nDo you want to play again? (yes/no):");
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                playAgain = false;
                System.out.println("Thank you for playing!");
            }
        }

        scanner.close();
    }
}
