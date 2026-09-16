import java.util.Scanner;
public class CalculateCgpa {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter First Subject GPA =");
        float gpa1= sc.nextFloat();
        System.out.print("Enter its Credit Hours = ");
        byte c1 = sc.nextByte();//c for Credit.

        System.out.print("Enter Second Subject GPA =");
        float gpa2= sc.nextFloat();
        System.out.print("Enter its Credit Hours = ");
        byte c2 = sc.nextByte();

        System.out.print("Enter Third Subject GPA =");
        float gpa3= sc.nextFloat();
        System.out.print("Enter its Credit Hours = ");
        byte c3 = sc.nextByte();

        System.out.print("Enter Forth Subject GPA =");
        float gpa4= sc.nextFloat();
        System.out.print("Enter its Credit Hours = ");
        byte c4 = sc.nextByte();

        System.out.print("Enter Fifth Subject GPA =");
        float gpa5= sc.nextFloat();
        System.out.print("Enter its Credit Hours = ");
        byte c5 = sc.nextByte();

        float cgpa = ((gpa1*c1) + (gpa2*c2) + (gpa3*c3) + (gpa4*c4) + (gpa5*c5)) / (c1+c2+c3+c4+c5) ;
        System.out.println("CGPA = " + cgpa);
}}
