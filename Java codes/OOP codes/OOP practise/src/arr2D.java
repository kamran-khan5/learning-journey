import java.util.Scanner;

public class arr2D {
    public static void sum()
    {
        Scanner sc=new Scanner(System.in);
        int[][] arr= new int[5][4];
        for (int i = 0; i < arr.length-1; i++)
        {
            System.out.println("Row no" + (i+1) + ": ");
            for (int j=0;j<arr[i].length;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                arr[4][i]+=arr[j][i];
            }
        }

        for (int[] row:arr)
        {
            for (int value:row)
            {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        sum();

    }
}
