import java.util.Stack;

public class PostFixToInFix {
    private String str;

    public PostFixToInFix(String expression){ this.str=expression;}

    public String toInfix()
    {
        Stack<String> stack =new Stack<>();
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(Character.toString(ch));
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String expression = "(" + operand1 + ch + operand2 + ")";
                stack.push(expression);
            }
        }
        return stack.pop();
    }



}
