import java.util.Random;

public class Chap_5_13 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] setA = {0, 3, 6, 9, 12};
        int randomA = setA[rand.nextInt(setA.length)];
        System.out.println("Random number from set A: " + randomA);

        int[] setB = {1, 2, 4, 8, 16, 32};
        int randomB = setB[rand.nextInt(setB.length)];
        System.out.println("Random number from set B: " + randomB);

        int[] setC = {10, 20, 30, 40};
        int randomC = setC[rand.nextInt(setC.length)];
        System.out.print("Random number from set C: " + randomC);
    }
}
