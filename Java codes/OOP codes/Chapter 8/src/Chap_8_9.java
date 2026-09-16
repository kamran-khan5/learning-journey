import java.security.SecureRandom;
import java.util.Scanner;

class Chap_8__9 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many number do you want to generate: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt(91) + 10;
            System.out.println(randomNumber);
        }
    }
}


