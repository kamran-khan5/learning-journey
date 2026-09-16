import java.util.Scanner;
public class FibonacciSeries
{
    static int fibonacci(int num)
    {
        if (num==1 || num==2)
        {
            return num-1;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number to get Fibonacci element : ");
        int num = sc.nextInt();

        System.out.println("Element = " + fibonacci(num));
    }

}
