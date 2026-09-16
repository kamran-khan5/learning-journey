import java.util.Scanner;
public class FindPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int check=1;
        System.out.print("Enter Number To Check its Prime Or Not : ");
        int num=sc.nextInt();

        for (int i=2 ;i<=(num/2); i++)
        {
            if (num%i==0)
            {
                check=0;
                break;  
            }
        }

        if (check==0)
        {
            System.out.printf("%d is Not Prime.",num);
        }
        else
        {
            System.out.printf("%d is Prime.",num);
        }

    }
}
