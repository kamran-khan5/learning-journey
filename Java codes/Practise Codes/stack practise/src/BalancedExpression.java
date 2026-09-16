import java.util.Scanner;
import java.util.Stack;

public class BalancedExpression {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Expression to Check it is Balanced or Not : ");
        String str=sc.nextLine();
        Stack<Character> stack=new Stack<Character>();
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (ch =='{' || ch =='(' || ch =='<' || ch =='[')
            {
                stack.push(ch);
            }

            switch (ch)
            {
                case '}':
                    if (stack.peek()=='{')
                    {
                        stack.pop();
                    }
                    break;

                case ')':
                    if (stack.peek()=='(')
                    {
                        stack.pop();
                    }
                    break;

                case '>':
                    if (stack.peek()=='<')
                    {
                        stack.pop();
                    }
                    break;

                case ']':
                    if (stack.peek()=='[')
                    {
                        stack.pop();
                    }
                    break;
            }
        }
        if (stack.isEmpty())
        {
            System.out.println("Expression is Balanced " + str);
        }
        else
        {
            System.out.println("Expression is Not Balanced " + str);
        }
    }
}
