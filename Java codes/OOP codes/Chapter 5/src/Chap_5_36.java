import java.util.Random;
import java.util.Scanner;

public class Chap_5_36 {


    public static void main(String[] args) {
        askQuestion();
    }

    public static void askQuestion() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        int answer = num1 * num2;
        System.out.printf("How much is %d times %d?%n", num1, num2);
        int guess = scanner.nextInt();
        while (guess != answer) {
            int ansIterator=random.nextInt(4);
            switch(ansIterator) {
                case 0:
                    System.out.println("No. Please try again.");
                    break;
                case 1:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 2:
                    System.out.println("Don't give up! Try again");
                    break;
                case 3:
                    System.out.println("No. Keep trying.");
                    break;
            }
            guess = scanner.nextInt();
        }
        int ansIterator=random.nextInt(4);
        switch(ansIterator) {
            case 0:
                System.out.println("Very good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Nice Work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
        askQuestion();
    }
}
