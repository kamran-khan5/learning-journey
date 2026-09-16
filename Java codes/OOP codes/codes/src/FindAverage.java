import java.util.Scanner;
public class FindAverage
{
    static int findAverage(int []num)
    {
        int sum = 0;
        for (int element:num)
        {
            sum+=element;
        }
        return sum/ num.length;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter how many numbers average do you want to find : ");
        int num= sc.nextInt();

        int []numbers = new int [num];
        for (int i=0; i<num; i++)
        {
            System.out.print("Enter " + (i+1) + " Number : ");
            numbers[i]= sc.nextInt();
        }
        System.out.println("Average = "+ findAverage(numbers));
    }
}
