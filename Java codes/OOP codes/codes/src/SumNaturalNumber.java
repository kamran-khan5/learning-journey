
import java.util.Scanner;
public class SumNaturalNumber
{
    static int numSum(int num)
    {
        if (num==1)
        {
            return 1;
        }
            return num + numSum(num-1);
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number to find its sum of natural number : ");
        int num= sc.nextInt();

        System.out.println("Sum = " + numSum(num));
    }
}
