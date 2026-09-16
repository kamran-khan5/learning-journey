import java.util.Scanner;
public class Chap_4_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program prints *Graphs after five input of 5 numbers between 1-30:");

        int[] number = new int[5];

        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter " + (i + 1) + " Number: ");
            number[i] = sc.nextInt();
            if (number[i] < 1 || number[i] > 30) {
                System.out.println("invalid input... Please Enter number Between 1-30.");
                i--;
            }
        }


        for (int i = 0; i < number.length; i++) {
            System.out.print( number[i] + "\t");

            for (int j = 0; j < number[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
