/*
Task 3: String Comparison Create a program that compares two strings entered by the user.
Prompt the user to input two sentences and check if they are the same. Display an appropriate
message indicating whether the strings are equal or not.
*/

import java.util.Scanner;

public class Task_3 {
    private static void compareCaseSensitive(String str1, String str2){
        if (str1.equals(str2))
        {
            System.out.println("First string & Second string are equal.");
            return;
        }
        System.out.println("First string & Second string are not equal.");
    }

    private static void compareIgnoreCase(String str1, String str2){
        if (str1.equalsIgnoreCase(str2))
        {
            System.out.println("First string & Second string are equal.");
            return;
        }
        System.out.println("First string & Second string are not equal.");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.print("Enter first string : ");
        String str1=sc.nextLine();
        System.out.print("Enter second string : ");
        String str2=sc.nextLine();
        do {
            System.out.println("Press 1: To compare string with case sensitive.");
            System.out.println("Press 2: To compare string Ignore cases.");
            System.out.print("Choice : ");
            choice= sc.nextInt();
            switch (choice)
            {
                case 1:
                    compareCaseSensitive(str1,str2);
                    break;

                case 2:
                    compareIgnoreCase(str1,str2);
                    break;

                default:
                    System.out.println("ERROR... Invalid Choice.");
            }
        }while (choice!=1 &&  choice!=2);
    }
}
