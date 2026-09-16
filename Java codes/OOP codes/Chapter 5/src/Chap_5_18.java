import java.util.Scanner;

public class Chap_5_18 {
    public static void squareOfAsterisks(int side) {
        for (int row = 1; row <= side; row++)
        {
            for (int col = 1; col <= side; col++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("Enter a Number to Print it's square of Asterisks:   ");
            int side= input.nextInt();
            squareOfAsterisks(side);
        }
}
