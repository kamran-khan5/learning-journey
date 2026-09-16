import java.util.Random;
import java.util.Scanner;

public class Chap_5_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(1000) + 1;
        int guess;
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Guess a number between 1 and 1000:");
            guess = input.nextInt();
            int guessCount=0;
            while (guess != numberToGuess) {
                if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
                guess = input.nextInt();
                guessCount++;//counts total guesses make to guess the number
                if(guess==numberToGuess && guessCount<10)
                {
                    System.out.println("Aha! You know the secret!");
                }else if(guess==numberToGuess && guessCount>10) {
                    System.out.println("You should be able to do better!");
                }


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
