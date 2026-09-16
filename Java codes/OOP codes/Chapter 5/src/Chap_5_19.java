import java.util.Scanner;

public class Chap_5_19 {
    public static void squareOfCharacter(int side,char character) {
        for (int row = 1; row <= side; row++) {
            for (int col = 1; col <= side; col++) {
                System.out.printf("%c\t",character);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a Number to Print it's square of Character: ");
        int side= input.nextInt();

        System.out.print("Enter Character To be Print: ");
        char character= input.next().charAt(0);

        squareOfCharacter(side,character);
    }
}
