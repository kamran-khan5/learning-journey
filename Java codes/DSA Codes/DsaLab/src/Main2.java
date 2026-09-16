import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Postfix Expression to convert Infix: ");
        PostFixToInFix inFix = new PostFixToInFix(sc.nextLine());
        System.out.println("Infix: " + inFix.toInfix());

    }
}