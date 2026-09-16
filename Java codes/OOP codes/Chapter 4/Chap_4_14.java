import java.util.Scanner;

/*(Modified Compound-Interest Program) Modify the compound-interest application of
Fig. 4.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
vary the interest rate.*/
public class Chap_4_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to find interest rate by 5%, 6%, 7%, 8%, 9% and 10% for 10 years: ");
        double amount = sc.nextDouble();


        for (double interest_rate = 0.05; interest_rate <= 0.10; interest_rate += 0.01) {
            System.out.printf("Interest interest_rate: %.2f%n", interest_rate);

            System.out.printf("%4s%30s%n", "Year", "Amount on deposit");

            for (int year = 1; year <= 10; ++year) {
                double total_amount = amount * Math.pow(1.0 + interest_rate, year);

                System.out.printf("%4d%,30.2f%n", year, total_amount);
            }

            System.out.println();
        }
    }
}
