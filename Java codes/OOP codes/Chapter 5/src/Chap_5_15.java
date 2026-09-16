import java.util.Scanner;

public class Chap_5_15 {
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1 of a Triangle: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 of a Triangle: ");
        double side2 = input.nextDouble();

        double hypotenuse = hypotenuse(side1, side2);

        System.out.println("The hypotenuse is : "+ hypotenuse);
    }

}
