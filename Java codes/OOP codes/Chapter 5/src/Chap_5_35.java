import java.util.Random;
import java.util.Scanner;
//student multiplication practise
public class Chap_5_35 {
    public static void main(String[] args) {
        askQuestion();
    }

    public static void askQuestion() {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        int answer = num1 * num2;
        System.out.printf("How much is %d times %d?%n", num1, num2);
        int guess = input.nextInt();
        while (guess != answer) {
            System.out.println("No. Please try again.");
            guess = input.nextInt();
        }
        System.out.println("Very good!");
        System.out.println("Do you want to continue Practise(y/n): ");
        String playAgain=input.next();
        askQuestion();
    }
}
