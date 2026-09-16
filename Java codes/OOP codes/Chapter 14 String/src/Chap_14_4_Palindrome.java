import java.util.Scanner;

public class Chap_14_4_Palindrome {
    public static boolean isPalindrome(String str)
    {
        StringBuilder tempStr=new StringBuilder();
        for (int i=0;i<str.length();i++)
        {
            tempStr.append(str.charAt(i));
        }
        String temp=tempStr.toString();
        return str.equals(temp);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\tChecking String is Palindrome Or Not");
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        if (isPalindrome(str))
        {
            System.out.println("String is Palindrome.");
        }
        else
        {
            System.out.println("String is Not Palindrome.");
        }
    }
}