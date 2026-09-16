import java.util.Scanner;

public class Chap_5_28 {
    public static String sportsRecommender(double celsius) {
        if (celsius >= 20 && celsius <= 30) {
            return "It’s lovely weather for sports today!";
        } else if (celsius >= 10 && celsius <= 40) {
            return "It’s reasonable weather for sports today.";
        } else {
            return "Please exercise with care today, watch out for the weather!";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Celsius temperature: ");
        double celsius = input.nextDouble();

        System.out.println(sportsRecommender(celsius));
    }
}
