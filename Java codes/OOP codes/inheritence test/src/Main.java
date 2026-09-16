import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Employ e1=new Employ("ameer","hamza",20,"1234",11,"20 may");
        SalariedEmployee se1;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your First Name:    ");
        String firstName=input.nextLine();

        System.out.print("Enter Your Last Name: ");
        String lastName=input.nextLine();


        System.out.print("Enter Your CNIC No: ");
        String cnicNo=input.nextLine();


        System.out.print("Enter Your dateOfBirth:   ");
        String dateOfBirth=input.nextLine();

        System.out.print("Enter Your Age:   ");
        int age=input.nextInt();

        System.out.print("Enter Your Employ Id:   ");
        int employId=input.nextInt();


        System.out.print("Enter Your Base Salary:   ");
        int baseSalary=input.nextInt();

        System.out.print("Enter Your Comission Rate:   ");
        double rate=input.nextDouble();

        System.out.print("Enter Your Total Sales:   ");
        int totalSales=input.nextInt();

        se1=new SalariedEmployee(firstName,lastName,age,cnicNo,employId,dateOfBirth,baseSalary,rate,totalSales);
        System.out.println("\n\n\n");
        System.out.println(se1);



    }
}