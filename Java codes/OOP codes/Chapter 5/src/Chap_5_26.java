import java.util.Scanner;

public class Chap_5_26 {
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a four-digit number: ");
            number = input.nextInt();
        }while (number<1000 ||number>9999);

        int sum = sumOfDigits(number);
        System.out.printf("The sum %d of the digits is %d.%n",number, sum);
    }
}
