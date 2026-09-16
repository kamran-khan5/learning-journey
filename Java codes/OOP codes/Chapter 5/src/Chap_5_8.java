import java.util.Scanner;

public class Chap_5_8 {
    public static double calculateCharges(int hours) {
        double charges = 2.0;

        if (hours > 3) {
            charges += 0.5 * (hours-3);

            if (charges > 10.0) {
                charges = 10.0;
            }
        }

        return charges;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCustomers = 0;
        double totalReceipts = 0.0;
        int cars=0;

        System.out.print("Enter hours parked for customer 1 (or -1 to exit): ");
        int hours = input.nextInt();

        while (hours != -1) {
            double charges = calculateCharges(hours);
            numCustomers++;
            totalReceipts += charges;
            cars++;

            System.out.printf("Customer %d's charge is $%.2f\n", numCustomers, charges);
            System.out.print("Enter hours parked for next customer (or -1 to exit): ");
            hours = input.nextInt();
        }
        System.out.printf("Total Cars Parked: %d\n",cars);
        System.out.printf("Total receipts for yesterday: $%.2f\n", totalReceipts);
    }

}
