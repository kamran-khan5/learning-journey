import java.util.Scanner;
public class Main {
    static void multi_table (int num)
    {
        for (int i=1; i<=10; i++)
        {
            System.out.println(num +" x " + i + " = " + num*i);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number to print its Multiplication Table : ");
        int num= sc.nextInt();

        multi_table(num);
    }
}
