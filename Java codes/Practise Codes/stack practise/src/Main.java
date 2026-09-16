import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to reverse: ");
        String str=sc.nextLine();
        Stack<Character> stack=new Stack<Character>();
        for (int i=0;i<str.length();i++)
        {
            stack.push(str.charAt(i));
        }
        str="";
        while (!stack.empty())
        {
            str+=stack.pop();
        }
        System.out.println("String After Reverse:\n" + str);


    }
}