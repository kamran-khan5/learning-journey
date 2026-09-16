import java.util.Scanner;

class Loan {
    protected double principalAmount;
    protected int tenure;

    public Loan(double principalAmount, int tenure) {
        this.principalAmount = principalAmount;
        this.tenure = tenure;
    }

    public double calculateMonthlyInstallment(double interestRate) {
        double monthlyInterestRate = interestRate / 12;
        int numberOfPayments = tenure * 12;

        double denominator = Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1;
        double installment = (principalAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / denominator;

        return installment;
    }
}

class HomeLoan extends Loan {
    private static final double INTEREST_RATE = 0.05; // 5% interest rate for Home Loan

    public HomeLoan(double principalAmount, int tenure) {
        super(principalAmount, tenure);
    }

    public double calculateMonthlyInstallment() {
        return super.calculateMonthlyInstallment(INTEREST_RATE);
    }
}

class VehicleLoan extends Loan {
    private static final double INTEREST_RATE = 0.08; // 8% interest rate for Vehicle Loan

    public VehicleLoan(double principalAmount, int tenure) {
        super(principalAmount, tenure);
    }

    public double calculateMonthlyInstallment() {
        return super.calculateMonthlyInstallment(INTEREST_RATE);
    }
}

class PersonalLoan extends Loan {
    private static final double INTEREST_RATE = 0.1; // 10% interest rate for Personal Loan

    public PersonalLoan(double principalAmount, int tenure) {
        super(principalAmount, tenure);
    }

    public double calculateMonthlyInstallment() {
        return super.calculateMonthlyInstallment(INTEREST_RATE);
    }
}

class Chap_9_8_InstallmentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter the tenure (in years): ");
        int tenure = scanner.nextInt();

        HomeLoan homeLoan = new HomeLoan(principalAmount, tenure);
        VehicleLoan vehicleLoan = new VehicleLoan(principalAmount, tenure);
        PersonalLoan personalLoan = new PersonalLoan(principalAmount, tenure);

        double homeLoanInstallment = homeLoan.calculateMonthlyInstallment();
        double vehicleLoanInstallment = vehicleLoan.calculateMonthlyInstallment();
        double personalLoanInstallment = personalLoan.calculateMonthlyInstallment();

        System.out.println("Monthly installment for Home Loan: $" + homeLoanInstallment);
        System.out.println("Monthly installment for Vehicle Loan: $" + vehicleLoanInstallment);
        System.out.println("Monthly installment for Personal Loan: $" + personalLoanInstallment);
    }
}
