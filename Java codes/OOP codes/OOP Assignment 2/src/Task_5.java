/*
Task 5: String Manipulation Write a program that allows the user to enter a sentence.
Implement a function that replaces all occurrences of a specific character in the sentence with
a different character. Prompt the user to input the character to be replaced and the
replacement character.
 */
import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=sc.nextLine();
        String replaceWithStr;
        while (true)
        {
            System.out.print("Enter with replace character : ");
            replaceWithStr=sc.nextLine();
            if (str.contains(replaceWithStr))
            {
                break;
            }
            System.out.println("This String '"+ str+ "' does not contain '"+replaceWithStr+"' .");
        }

        System.out.print("Enter replacing character : ");
        String replaceStr=sc.nextLine();

        str=str.replace(replaceWithStr,replaceStr);
        System.out.println("String After '" + replaceWithStr + "' replacing with '"+replaceStr+"' : ");
        System.out.println(str);
    }
}
