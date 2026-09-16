import java.util.Scanner;

public class SumOfMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [][] arr=new int[5][4];

        for (int i=0;i<4;i++)
        {
            System.out.println("Enter row no: "+(i+1)+"\n");
            for (int j=0;j<4;j++)
            {
                arr[i][j]= sc.nextInt();
            }

        }
        int sum;
        for (int i=0;i<5;i++)
        {
            sum=0;
            for (int j=0;j<4;j++)
            {
                System.out.print(arr[i][j]+"     ");
                if(i!=4)
                {
                    sum+=arr[j][i];
                }

            }
            if(i!=4)
            {
                arr[4][i]=sum;
            }
            System.out.println();
        }


    }
}
