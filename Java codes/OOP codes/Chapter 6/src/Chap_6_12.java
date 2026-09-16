import java.util.Scanner;

public class Chap_6_12 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] uniqueNumbers = new int[10];
        int index = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            int number = input.nextInt();

            // Check if number is within range
            if (number < 10 || number > 100) {
                System.out.println("Number must be between 10 and 100.");
                i--;
                continue; //skip current iteration of loop
            }

            // Check if number is already in the array
            boolean duplicate = false;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == number) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {  //if true the cond won't work
                numbers[i] = number;
                uniqueNumbers[index++] = number;
            }
        }


        System.out.println("\nUnique numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }
    }
}
