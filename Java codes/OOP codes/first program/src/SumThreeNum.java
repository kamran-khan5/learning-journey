import java.util.Scanner;
public class SumThreeNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter First Number =");
        float num1 = sc.nextFloat();

        System.out.print("Enter Second Number =");
        float num2 = sc.nextFloat();

        System.out.print("Enter Third Number =");
        float num3 = sc.nextFloat();

        float sum = num1 + num2 + num3;
        System.out.println("Sum of Three Numbers = " + sum);

    }
}
