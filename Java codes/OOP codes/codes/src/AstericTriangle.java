import java.util.Scanner;
public class AstericTriangle
{
    static void printTriangle(int row_no)
    {
        for (int i=0; i<row_no; i++)
        {
            for (int j=0 ; j<=i; j++)
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
