/*
Task 4: Substring Extraction Develop a program that prompts the user to enter a sentence and
a word. Extract and display the substring containing the word from the sentence. If the word
is not found in the sentence, display an appropriate message.
*/

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string : ");
        String str=sc.nextLine();
        int startIndex, endIndex;
        do {
            System.out.print("Enter starting index : ");
            startIndex=sc.nextInt();
            if (startIndex<0 || startIndex>str.length()-1)
                System.out.println("Invalid starting Index. It must be 0 or greater & smaller than length of string.");
        }while (startIndex<0 || startIndex>str.length()-1);

        do {
            System.out.print("Enter ending index : ");
            endIndex=sc.nextInt();
            if (endIndex<0 || endIndex>str.length()-1 || endIndex<=startIndex)
                System.out.println("Invalid starting Index. It must be greater than starting index & smaller than length of string. ");
        }while (endIndex<0 || endIndex>str.length()-1 || endIndex<=startIndex) ;

        String subStr=str.substring(startIndex,endIndex);
        System.out.println("Extracted sub string : " + subStr);
    }
}
