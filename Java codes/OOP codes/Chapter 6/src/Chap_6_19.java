import java.util.Scanner;

public class Chap_6_19 {
    public static final int NUM_SEATS = 10;
    public static final int FIRST_CLASS_CAPACITY = 5;

    public static boolean[] seats = new boolean[NUM_SEATS];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Please type 1 for First Class and 2 for Economy: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                assignSeat(true); // First class
            } else if (choice == 2) {
                assignSeat(false); // Economy
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void assignSeat(boolean firstClass) {
        int start, end;
        if (firstClass) {
            start = 0;
            end = FIRST_CLASS_CAPACITY;
        } else {
            start = FIRST_CLASS_CAPACITY;
            end = NUM_SEATS;
        }
        for (int i = start; i < end; i++) {
            if (!seats[i]) {
                seats[i] = true;
                printSeats(i, firstClass);//print seat
                return;
            }
        }
        System.out.println("Section is full. Would you like to be placed in the other section? (y/n)");
        char response = scanner.next().charAt(0);
        if (response == 'y') {
            assignSeat(!firstClass); // Assign in the other section
        } else {
            System.out.println("Next flight leaves in 3 hours.");
        }
    }

    public static void printSeats(int seatNumber, boolean firstClass) {
        System.out.printf("Seat number: %d, %s class%n", seatNumber + 1, firstClass ? "First" : "Economy");
    }
}
