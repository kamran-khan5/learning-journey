import java.util.Random;
import java.util.Scanner;
//guess number game
public class Chap_5_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(1000) + 1;
        int guess;
        boolean playAgain = true;

        while (playAgain) {
            System.out.print("Guess a number between 1 and 1000:");
            guess = input.nextInt();

            while (guess != numberToGuess) {
                if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
                System.out.print("Guess again: ");
                guess = input.nextInt();
            }

            System.out.println("Congratulations. You guessed the number!");

            System.out.println("Do you want to play again? (y/n)");
            char answer = input.next().charAt(0);

            if (answer=='n') {
                playAgain = false;
            } else {
                numberToGuess = random.nextInt(1000) + 1;
            }
        }

        System.out.println("Thanks for playing!");
    }
}
