import java.util.Scanner;

public class Chap_5_16 {
    public static boolean isMultiple(int num1, int num2) {
        return (num2 % num1 == 0);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter two integers (or 0 to exit): ");
            int num1 = input.nextInt();
            if (num1 == 0) {
                break;
            }
            int num2 = input.nextInt();

            if (isMultiple(num1, num2)) {
                System.out.printf("%d is a multiple of %d%n", num2, num1);
            } else {
                System.out.printf("%d is not a multiple of %d%n", num2, num1);
            }
        }
    }
}
