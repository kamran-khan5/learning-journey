import java.util.Scanner;
public class AstericTriangleRecursion1
{
    static void printTriangle(int row_no)
    {
        if (row_no>0)
        {
            printTriangle(row_no - 1);

            for (int i = 0; i < row_no; i++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        return ;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter row Number to Print Asteric Triangle : ");
        int row_no= sc.nextInt();

        printTriangle(row_no);
    }
}


