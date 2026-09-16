import java.util.Scanner;

public class TestEvaluatePostFix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter PostFix Expression To Elevate: ");
        EvaluatePostFix expElevate=new EvaluatePostFix(sc.nextLine());
        System.out.println("Answer: " + expElevate.postFixElevation());
    }
}