import java.util.Scanner;

public class Chap_5_14 {
    public static int myFloor(double num) {
        int floor = (int) num;
        if (floor > num) {
            floor--;
        }
        return floor;
    }

    public static int myCeil(double num) {
        int ceil = (int) num;
        if (ceil < num) {
            ceil++;
        }
        return ceil;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double num;
        System.out.print("Enter A Number To Find it's Ciel And Floor Value:    ");
        num= input.nextDouble();
        System.out.printf("myFloor(%.3f) = %d\n", num, myFloor(num));
        System.out.printf("myCeil(%.3f) = %d\n", num, myCeil(num));
    }
}
