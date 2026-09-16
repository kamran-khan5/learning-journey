import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int row=4, col=4;
        int [][] num=new int[row][col];
        for (int i=0;i<row;i++)
        {
            System.out.println("Enter "+(i+1)+" row :");
            for (int j=0;j<col;j++)
            {
                num[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print(num[i][j]+"\t\t");
            }
            System.out.println();
        }

    }
}
