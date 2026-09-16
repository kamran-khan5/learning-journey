import java.util.Scanner;
public class CheckInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer = ");
        boolean check= sc.hasNextInt();
        if (check){
            System.out.println("You Entered an Integer.");
        }
        else{
            System.out.println("N0, You does not Entered an Integer.");
        }
    }
}
