import java.util.Scanner;

public class Chap_5_17 {

    public static boolean isDivisible(int number) {
        return (number % 5 == 0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        while (true)
        {
            System.out.print("Enter a Number (or 0 to quit):  ");
            num = input.nextInt();
            if (num == 0) {
                break;
            }
            if (isDivisible(num)) {
                System.out.printf("%d is Divisible by 5\n",num);
            } else
                System.out.printf("%d is not Divisible by 5\n",num);
        }


    }
}
