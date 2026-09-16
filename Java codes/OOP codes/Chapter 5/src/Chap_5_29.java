import java.util.Random;
import java.util.Scanner;

public class Chap_5_29 {
    private static enum Coin {HEADS, TAILS};
    public static Coin flip() {
        Random random = new Random();
        int result = random.nextInt(2);
        if (result == 0) {
            return Coin.HEADS;
        } else {
            return Coin.TAILS;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;
        boolean continueTossing = true;

        while (continueTossing) {
            System.out.print("Press 1 to toss the coin, or 2 to quit: ");
            int choice = input.nextInt();

            if (choice == 1) {
                Coin result = flip();
                if (result == Coin.HEADS) {
                    headsCount++;
                    System.out.println("Heads!");
                } else {
                    tailsCount++;
                    System.out.println("Tails!");
                }
            } else if (choice == 2) {
                continueTossing = false;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("Number of Heads: " + headsCount);
        System.out.println("Number of Tails: " + tailsCount);
    }
}
