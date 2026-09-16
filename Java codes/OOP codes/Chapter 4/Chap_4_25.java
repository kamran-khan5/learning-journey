import java.util.Scanner;

public class Chap_4_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Printing Diamond ");
        System.out.print("Enter an odd number from 1 to 19: ");
        int rows = sc.nextInt();


        for (int i = 0; i <= rows/2; i++) {
            for (int space = 0; space < rows/2 - i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows/2 -1; i >= 0; i--) {
            for (int space = 0; space < rows/2 - i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
