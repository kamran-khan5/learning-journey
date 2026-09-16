import java.util.Random;

public class Chap_6_17 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] counts = new int[13];


        for (int i = 0; i < 36000000; i++) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;
            counts[sum]++;
        }

        System.out.printf("%s%20s%n", "Sum", "Frequency");
        for (int i = 2; i <= 12; i++) {
            System.out.printf("%2d%20d%n", i, counts[i]);
        }
    }
}
