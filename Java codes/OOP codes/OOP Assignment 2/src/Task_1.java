/*
Task 1: String Creation Create a program that prompts the user to enter a sentence or phrase.
Store the input in a String variable and display it back to the user. Experiment with different
types of input, such as sentences with spaces, special characters, or numbers.
*/

import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=sc.nextLine();
        System.out.print("Entered string : " + str);
    }
}