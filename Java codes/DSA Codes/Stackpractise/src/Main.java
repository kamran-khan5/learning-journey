import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter PostFix Expression To Elevate: ");
        StackPractise expElevate=new StackPractise(sc.nextLine());
        System.out.println("Answer: " + expElevate.postFixElevation());
    }
}