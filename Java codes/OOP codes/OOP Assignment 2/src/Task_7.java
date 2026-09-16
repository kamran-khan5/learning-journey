/*
Task 7: Palindrome Detection Design a program that asks the user to enter a word or phrase.
Implement a function to determine whether the input is a palindrome (reads the same
forwards and backwards) and display an appropriate message.
 */
import java.util.Scanner;
public class Task_7 {
    private static boolean isPalindrome(String str)
    {
        StringBuilder tempStr=new StringBuilder();
        for (int i=str.length()-1;i>=0;i--)
        {
            tempStr.append(str.charAt(i));
        }
        return str.equals(tempStr.toString());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=sc.nextLine();
        if (isPalindrome(str))
        {
            System.out.println("String is palindrome.");
        }
        else
        {
            System.out.println("String not is palindrome.");
        }
    }
}
