import java.util.Scanner;
public class AstericTriangleRecursion
{
    static int printTriangle(int row_no)
    {
        for (int i=0; i<row_no; i++)
        {
            System.out.print(" * ");
        }
        System.out.print("\n");
        if (row_no==0)
        {
            return 0;
        }
        return printTriangle(row_no-1);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter row Number to Print Asteric Triangle : ");
        int row_no= sc.nextInt();

        printTriangle(row_no);
    }
}

