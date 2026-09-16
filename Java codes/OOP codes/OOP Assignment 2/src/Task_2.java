/*
Task 2: String Concatenation Write a program that asks the user for their first name and last
name separately. Concatenate the two names into a single string and display it as the full
name. Ensure that there is a space between the first and last name.
*/

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Name : ");
        String firstName=sc.nextLine();
        System.out.print("Enter last name : ");
        String lastName=sc.nextLine();
        String name=firstName+" "+lastName;
        System.out.println("Entered name : " + name);
    }
}
