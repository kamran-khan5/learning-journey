import java.util.Scanner;

public class Chap_5_27 {

    public static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;       //algo from link in question(Euclid's algo)
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        int gcd = gcd(number1, number2);

        System.out.println("The greatest common divisor of " + number1 + " and " + number2 + " is " + gcd + ".");
    }
}
