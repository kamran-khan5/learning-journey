import java.util.Scanner;
public class OpositeTriangle
{
    static void printTriangle(int row_no)
    {
        for (int i=row_no; i>=1; i--)
        {
            for (int j=1 ; j<=i; j++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter row Number to Print Asteric Triangle : ");
        int row_no= sc.nextInt();

        printTriangle(row_no);
    }
}
