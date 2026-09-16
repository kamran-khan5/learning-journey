package Employe;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Employe emp= new Employe(1,2,3,"a","b");

        System.out.print("Enter Your Name :");
        String name=sc.nextLine();

        System.out.println("Enter your ID : ");
        int id= sc.nextInt();

        System.out.println("Enter Joining Date : ");
        String date=sc.nextLine();

        System.out.println("Enter Your Current Scale : ");
        int scale= sc.nextInt();

        System.out.println("Enter Your Salary : ");
        int salary= sc.nextInt();

        emp.set


    }
}