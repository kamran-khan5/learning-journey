import java.util.Scanner;

public class Chap_5_9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double user_input;

        System.out.print("Enter a Number: ");
        user_input=input.nextDouble();

        System.out.printf("The Number Before Rounding Off is : %2.2f\n",user_input);
        System.out.printf("The Number After Rounding Off is :%2.2f\n",Math.floor(user_input+0.5));
    }
}
