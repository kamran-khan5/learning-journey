import java.util.Scanner;

public class Chap_6_29 {
    public static void Fibonacci(int num)
    {
        int first = 0, second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < num; i++)
        {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    public static void Fibonacci(double num)
    {
        double first = 0, second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < num; i++)
        {
            double next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    public static void possibleIntFibonacci()
    {
        int first = 0, second = 1;
        do {
            int next = first + second;
            first = second;
            second = next;
        }while (second>0);
        System.out.println("Possible integer type Fibonacci Term: "+first);
    }

    public static void possibleDoubleFibonacci()
    {
        double first = 0, second = 1;
        do {
            double next = first + second;
            first = second;
            second = next;
        }while (second>0);
        System.out.println("Possible double type Fibonacci Term: "+first);
    }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("\t Print Fibonacci Series:\n");
            int choice;

            do {
                System.out.println("Press 1 for integer type number.\nPress 2 for double type number:");
                System.out.println("Press 3 for possible integer type Fibonacci number.\n" +
                        "Press 4 for possible double type Fibonacci number:");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Nth term of Fibonacci Series (integer type): ");
                        int int_num = input.nextInt();
                        Fibonacci(int_num);
                        break;

                    case 2:
                        System.out.print("Enter Nth term of Fibonacci Series (double type): ");
                        double double_num = input.nextDouble();
                        Fibonacci(double_num);
                        break;

                    case 3:
                        possibleIntFibonacci();
                        break;

                    case 4:
                        possibleDoubleFibonacci();
                        break;

                    default:
                        System.out.println("Invalid Input...   ");
                        break;
                }

            } while (choice <= 0 || choice >= 5);
        }

}
