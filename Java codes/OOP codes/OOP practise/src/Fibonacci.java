import java.util.Scanner;

public class Fibonacci {
    public static void fibonacciSeries(int term)
    {
        int f1=0;
        int f2=1;
        int temp=f1+f2;
        System.out.print(f1 + "\t" + f2);

        for (int i=1;i<=term; i++)
        {
            System.out.print("\t"+temp);
            f1=f2;
            f2=temp;
            temp=f1+f2;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Nth Term of Fibonacci Series: ");
        fibonacciSeries(sc.nextInt());

    }

}

