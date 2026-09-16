import java.util.Scanner;

public class StackTest {
    public static Stack1 stack;
    public static void createStack (int capacity)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter capacity of stack: ");
        stack=new Stack1(sc.nextInt());
    }

    public static void pushValue ()
    {
        Scanner sc=new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter value for Push to Stack or -1 for exit: ");
            num=sc.nextInt();
            stack.push(num);
        }while (num!=-1);
    }

    public static void popValue ()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many value do you want to pop: ");
        int num=sc.nextInt();
        while (num!=0)
        {
            stack.pop();
            num--;
        }
    }

    public static void empty()
    {
        if (stack.isEmpty())
        {
            System.out.println("Stack is Empty.");
        }
        else
        {
            System.out.println("Stack is Not Empty.");
        }
    }

    public static void peekValue()
    {
        System.out.println(stack.peek());
    }

    public static void display()
    {
        System.out.println(stack);
    }

    public static void size()
    {
        System.out.println(stack.getSize());
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Press 1 for create Stack.");
            System.out.println("Press 2 for Push value to Stack.");
            System.out.println("Press 3 for pop value to Stack.");
            System.out.println("Press 4 for check is Stack Empty.");
            System.out.println("Press 5 for Peek value of Stack.");
            System.out.println("Press 6 for Get size of Stack.");
            System.out.println("Press -1 for Exit.");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter size of stack do you want to create: ");
                    StackTest.createStack(sc.nextInt());
                    break;

                case 2:
                    StackTest.pushValue();
                    break;

                case 3:
                    StackTest.popValue();
                    break;

                case 4:
                    StackTest.empty();
                    break;

                case 5:
                    StackTest.peekValue();
                    break;

                case 6:
                    StackTest.size();
                    break;

                case -1:
                    System.exit(1);
                    break;

                default:
                    System.out.println("Invalid input... try Again");
                    break;
            }

        }while (choice!=-1);
    }
}
