import java.util.Scanner;

/*(Modified Compound-Interest Program) Modify the application in Fig. 4.6 to use only integers
 to calculate the compound interest. [Hint: Treat all monetary amounts as integral numbers
of pennies. Then break the result into its dollars and cents portions by using the division and
remainder operations, respectively. Insert a period between the dollars and the cents portions.]
 */
public class Chap_4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int amount = 0;
        int rate = 0;
        int years = 0;
        int dollars = 0;
        int cents = 0;

        System.out.print("Enter the initial Amount: ");
        amount = input.nextInt();

        System.out.print("Enter the interest rate (as a percentage): ");
        rate = input.nextInt();

        System.out.print("Enter the number of years: ");
        years = input.nextInt();

        int temp_amount = amount * 100; // Convert dollars to cents

        for (int i = 1; i <= years; i++) {
            int interest = (temp_amount * rate) / 100;
            temp_amount += interest;
        }

        dollars = temp_amount / 100; // Convert cents to dollars
        cents = temp_amount % 100; // Get the cents portion

        System.out.printf("After %d years at %d%% interest, the investment will be worth $%d.%02d%n", years, rate, dollars, cents);
    }
}

