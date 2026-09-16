import java.util.Scanner;
public class MarksPercentage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Total PerSubject=");
        float total_marks= sc.nextFloat();

        System.out.print("Enter First Subject Marks=");
        float mark1= sc.nextFloat();

        System.out.print("Enter Second Subject Marks=");
        float mark2= sc.nextFloat();

        System.out.print("Enter Third Subject Marks=");
        float mark3= sc.nextFloat();

        System.out.print("Enter Forth Subject Marks=");
        float mark4= sc.nextFloat();

        System.out.print("Enter Fifth Subject Marks=");
        float mark5= sc.nextFloat();

        float percentage= (mark1+mark2+mark3+mark4+mark5)*100/(total_marks*5);

        System.out.println("Percentage = "+percentage);
    }
}
