import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack stack=new Stack();
        int choice;
        System.out.println("\tWelcome to Stack");
        do {
            System.out.println("Press 1 for Push Value.");
            System.out.println("Press 2 for Pop Value.");
            System.out.println("Press 3 for Display Stack.");
            System.out.println("Press 0 for Exit.");
            System.out.print("Choice: ");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter Pushing Value: ");
                    stack.push(sc.nextInt());
                    break;

                case 2:
                    stack.pop();
                    System.out.println("Value is Successfully Deleted.\n\n");
                    break;

                case 3:
                    System.out.println(stack.toString());
                    break;

                case 0:
                    break;

                default:
                    System.out.println("ERROR...   Invalid Input.");
                    break;
            }
        }while (choice!=0);
        System.out.println("\tProgram End.");
    }
}