import java.util.Scanner;
public class ConvertToLowerCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter String to change it in lower case : ");
        String str =sc.nextLine();
        System.out.println("String in lower case :"+str.toLowerCase());
    }
}
