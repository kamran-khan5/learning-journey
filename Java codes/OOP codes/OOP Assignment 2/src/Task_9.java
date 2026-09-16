/*
Task 9: String Formatting Create a program that takes a sentence as input and converts it to
title case (capitalizing the first letter of each word). Display the formatted sentence.
 */
import java.util.Scanner;
public class Task_9 {
    private static String formatingString(String str)
    {
        char[] charArray=str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(i==0)
            {
                char character=charArray[i];
                charArray[i]=Character.toUpperCase(character);
            }
            if (charArray[i]==' '){
                char character=charArray[i+1];
                charArray[i+1]=Character.toUpperCase(character);

            }
        }
        StringBuilder tempStr=new StringBuilder();
        for (char ch : charArray) {
            tempStr.append(ch);
        }
        return tempStr.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String str=sc.nextLine();
        System.out.println("Formatted sentence : "+formatingString(str));
    }
}
