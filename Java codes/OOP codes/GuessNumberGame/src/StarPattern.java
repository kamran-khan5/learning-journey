import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int lenght;
        do {
            System.out.println("Enter Lenght of Diamond in Odd Number : ");
            lenght=sc.nextInt();
            if (lenght%2==0)
            {
                System.out.println("Invalid input... Try Again.");
            }
        }while (lenght%2==0);

        for (int i=1; i<=lenght/2+1; i++)
        {
            for (int sp=lenght/2+1; sp>=1; sp--)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
