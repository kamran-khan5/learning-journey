/*
Task 6: String Analysis Create a program that takes a sentence as input. Implement functions
to determine and display the following information:
• The number of characters in the sentence (including spaces).
• The number of words in the sentence.
• Whether the sentence starts with a capital letter.
• Whether the sentence ends with a punctuation mark.
 */
import java.util.Scanner;
public class Task_6 {
    private static int wordInString(String str)
    {
        int words=0;
        for (int i=0;i<str.length();i++)
        {
            if (Character.isAlphabetic(str.charAt(i)))
                words++;
        }
        return words;
    }

    private static void isStartWithCapitalLetter(String str)
    {
        if (str.charAt(0)>64 && str.charAt(0)<91)
        {
            System.out.println("Sentence start with capital letter.");
            return;
        }
        System.out.println("Sentence does not start with capital letter.");
    }

    private static void endWithPunctuation(String str)
    {
        if (str.endsWith(".")){
            System.out.println("Sentence ends with a punctuation mark.");
            return;
        }
        System.out.println("Sentence does not ends with a punctuation mark.");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=sc.nextLine();
        System.out.print("The number of characters in the sentence (including spaces) : "+str.length());
        System.out.println("\nThe number of words in the sentence : "+ wordInString(str));
        isStartWithCapitalLetter(str);
        endWithPunctuation(str);
    }
}
