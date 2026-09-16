import java.util.Scanner;
public class KilometerIntoMiles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Kilometer To Change into Miles = ");
        double kilo_meter = sc.nextDouble();

        double miles = kilo_meter*0.62137119;
        System.out.println("Miles = "+ miles);
    }
}
