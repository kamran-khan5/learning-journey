import java.util.Scanner;
public class Calculator {
    public static double addition(double num1, double num2){
        return num1+num2;
    }

    public static double subtraction(double num1, double num2){
        return num1-num2;
    }

    public static double multiplication(double num1, double num2){
        return num1*num2;
    }

    public static double division(double num1, double num2){
        return num1/num2;
    }

    public static double remainder(double num1, double num2){
        return num1%num2;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double num1, num2;
        byte op;

        System.out.print("Enter First Number = ");
        num1 = sc.nextDouble();

        System.out.print("Enter Second Number = ");
        num2 = sc.nextDouble();

        do {

        System.out.println("Press 1 for '+' .\nPress 2 for '-' .");
        System.out.println("Press 3 for '*' .\nPress 4 for '/' .\nPress 4 for '/' .");
        op = sc.nextByte();

        switch (op){
            case 1:
                System.out.println("SUM = " + Calculator.addition(num1,num2));
                break;

            case 2:
                System.out.println("Subtraction = " + Calculator.subtraction(num1,num2));
                break;

            case 3:
                System.out.println("Multiplication = " + Calculator.multiplication(num1,num2));
                break;

            case 4:
                System.out.println("Division = " + Calculator.division(num1,num2));
                break;

            case 5:
                System.out.println("Remainder = " + Calculator.remainder(num1,num2));
                break;

            default:
                System.out.println("ERROR... Invalid input");
                break;
        }
    }while (op<0 || op>6);
}}
