import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please! Enter Your Good Name = ");
        String name= sc.nextLine();
        System.out.println("Hello " + name + ", Have A Great Day.");
    }
}
