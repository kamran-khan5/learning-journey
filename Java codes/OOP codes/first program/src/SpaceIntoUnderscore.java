import java.util.Scanner;

public class SpaceIntoUnderscore {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter String to change Space with Underscore : ");
        String str =sc.nextLine();
        System.out.println("String After update :"+str.replace(" ", "_"));
    }
}
