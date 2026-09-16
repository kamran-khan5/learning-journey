import java.util.Scanner;

/*4.11 (Extremes) Write an application that finds the minimum and maximum amongst several
integers and then computes the sum of the two extremes. The user will be prompted to input how
many values the application should ask the user to input.*/
public class Chap_4_11 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num,max,min,input;

        System.out.println("Enter how many number do you want to input: ");
        num= sc.nextInt();
        System.out.println("Input numbers");
        input=sc.nextInt();
        max=input;
        min=input;
        for (int i=1;i<num;i++)
        {
            input=sc.nextInt();
            if (max<input)
            {
                max=input;
            }
            if(min>input)
            {
                min=input;
            }
        }
        System.out.println("Maximum: " + max + "\nMinimum: "+min+"\nSum: "+(min+max));

    }
}
