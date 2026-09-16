import java.util.Scanner;

public class Chap_5_22 {
    public static int celsiusToKelvin(int celsius) {
        return celsius + 273;
    }


    public static int kelvinToCelsius(int kelvin) {
        return kelvin - 273;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int press;
        do
        {
            System.out.println("Press 1 for Convert Kelvin to Celsius\nPress 2 for Convert Celsius to Kelvin: ");
            press=input.nextInt();

            if (press==2)
            {
                System.out.println("Enter temperature in Celsius: ");
                int tempValue = input.nextInt();
                int kelvin = celsiusToKelvin(tempValue);
                System.out.println(tempValue + " Celsius = " + kelvin + " Kelvin.");
            }
            else if (press==1)
            {
                System.out.println("Enter temperature in Kelvin: ");
                int tempValue = input.nextInt();
                int celsius = kelvinToCelsius(tempValue);
                System.out.println(tempValue + " Kelvin = " + celsius + " Celsius.");
            }
            else
            {
                System.out.println("Invalid temperature type.");
            }
        }while (press!=1 && press!=2);
    }
}
