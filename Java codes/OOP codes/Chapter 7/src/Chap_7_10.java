import java.util.Scanner;

class Account {
    String name;
    double balance;

    public String getName() {
        return name;
    }
public void setName(String name) {

    for (int i=0;i< name.length();i++) {
        if (!(name.charAt(i) >= 'a' && name.charAt(i) <= 'z') && !(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') && name.charAt(i) != ' ') {
            return;
        }
    }
        name=name.trim();
        this.name = name;
}

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance>0.0)
        {
            this.balance = balance;
        }
    }

    public Account(String name, double balance)
    {
        setName(name);
        setBalance(balance);
    }

    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0)
        {
            balance+=depositAmount;
            System.out.println(depositAmount + " amount is successfully deposit to your account.");
            System.out.println("Current Balanced: " + getBalance());
        }
    }

    public void withdraw(double withdrawAmount)
    {
        if (withdrawAmount>balance)
        {
            System.out.println("Withdrawal amount exceeded account balance.");
            return;
        }
        balance-=withdrawAmount;
        System.out.println(withdrawAmount + " amount is successfully withdraw from your account.");
        System.out.println("Current Balanced: " + getBalance());
    }
}

class Chap_7_10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name to create Account: ");
        String name = sc.nextLine();

        System.out.println("Enter deposit Amount: ");
        double balance = sc.nextDouble();

        Account account1 = new Account(name, balance);
        System.out.println(account1.getName());
        System.out.println(account1.getBalance());

        System.out.println("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account1.deposit(depositAmount);

        System.out.println("Enter Withdraw amount: ");
        double withdrawAmount = sc.nextDouble();
        account1.withdraw(withdrawAmount);
    }
}
