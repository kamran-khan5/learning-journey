import java.util.Stack;

public class EvaluatePostFix {
    private String expression;
    public EvaluatePostFix (String expression)
    {
        this.expression =expression;
    }

    private int power (int base, int exponent)
    {
        int result=1;
        while (exponent!=0)
        {
            result*=base;
            exponent--;
        }
        return result;
    }


    private boolean isDigit(int ch)
    {
        ch-='0';
        return ch >= 0 && ch < 10;
    }
    public int postFixElevation ()
    {
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i< expression.length(); i++)
        {
            char ch= expression.charAt(i);

            if (ch == ' ')
            {
                continue;
            }

            else if (isDigit((int)ch))
            {
                stack.push(ch-'0');
            }
            else
            {
                int operand1=stack.pop();
                int operand2=stack.pop();

                switch (ch)
                {
                    case '^':
                        int temp=power(operand2,operand1);
                        stack.push(temp);
                        break;

                    case '+':
                        stack.push(operand2+operand1);
                        break;

                    case '-':
                        stack.push(operand2-operand1);
                        break;

                    case '*':
                        stack.push(operand2*operand1);
                        break;

                    case '/':
                        stack.push(operand2/operand1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
