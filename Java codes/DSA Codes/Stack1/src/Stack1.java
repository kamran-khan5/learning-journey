import java.util.Stack;
public class Stack1 {
    public String reverse(String str)
    {
        Stack<Character> stack=new Stack<>();

        for (char ch: str.toCharArray())
        {
            stack.push(ch);
        }

        StringBuffer newStr=new StringBuffer();
        while (!stack.empty())
        {
            newStr.append(stack.pop());
        }
        return newStr.toString();
    }

    public boolean isBalanced(String str)
    {
        Stack<Character> stack=new Stack<>();

        for (char ch: str.toCharArray())
        {
            if (ch=='(' || ch=='[' || ch=='<' || ch=='{' )
            {
                stack.push(ch);
            }

            if (ch==')' || ch==']' || ch=='>' || ch=='}')
            {
                if (stack.empty())
                {
                    return false;
                }
                int top=stack.pop();
                if (    (ch==')' && top!='(')||
                        (ch==']' && top!='[')||
                        (ch=='>' && top!='<')||
                        (ch=='}' && top!='{')
                )
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


}
