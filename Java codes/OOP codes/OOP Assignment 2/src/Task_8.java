/*
Task 8: String Splitting Write a program that prompts the user to enter a sentence. Split the
sentence into individual words and store them in an array of strings. Display each word on a
new line.
 */
import java.util.Scanner;
public class Task_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=sc.nextLine();
        System.out.print("Enter splitting characters : ");
        String splitChar=sc.nextLine();
        String[] strArray=str.split(splitChar);
        for (String temp:strArray)
        {
            System.out.println(temp);
        }
    }
}
