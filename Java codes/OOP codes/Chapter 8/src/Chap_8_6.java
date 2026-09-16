class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance) {
        savingsBalance = balance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate>0.0 && newRate<10? newRate: 0;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}

public class Chap_8_6 {
    public static void main(String[] args) {
        SavingsAccount saveAccount1 = new SavingsAccount(2000.00);
        SavingsAccount saveAccount2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("SaveAccount 1 - Initial Balance: $" + saveAccount1.getSavingsBalance());
        System.out.println("SaveAccount 2 - Initial Balance: $" + saveAccount2.getSavingsBalance());

        for (int i = 1; i <= 12; i++) {
            saveAccount1.calculateMonthlyInterest();
            saveAccount2.calculateMonthlyInterest();

            System.out.println("Month " + i + " - SaveAccount 1 Balance: $" + saveAccount1.getSavingsBalance());
            System.out.println("Month " + i + " - SaveAccount 2 Balance: $" + saveAccount2.getSavingsBalance());
        }

        SavingsAccount.modifyInterestRate(0.05);

        saveAccount1.calculateMonthlyInterest();
        saveAccount2.calculateMonthlyInterest();

        System.out.println("Next Month - SaveAccount 1 Balance: $" + saveAccount1.getSavingsBalance());
        System.out.println("Next Month - SaveAccount 2 Balance: $" + saveAccount2.getSavingsBalance());
    }
}
