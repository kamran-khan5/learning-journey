import java.util.Scanner;

class AccountModified{
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

    public AccountModified(String name, double balance)
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
public class Chap_7_14 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        AccountModified account1=new AccountModified(getName(),getBalance());
        System.out.println("Account 2 Detail:");
        sc.nextLine();
        AccountModified account2=new AccountModified(getName(),getBalance());
        displayAccountDetail(account1);
        displayAccountDetail(account2);

    }

    public static String getName()
    {
        System.out.println("Enter your name to create Account: ");
        String name = sc.nextLine();
        return name;
    }

    public static double getBalance()
    {
        System.out.println("Enter deposit Amount: ");
        double balance = sc.nextDouble();
        return balance;
    }



    public static void displayAccountDetail(AccountModified account)
    {
        System.out.println("Account Detail:");
        System.out.println("Name: " + account.name);
        System.out.println("Balance: " + account.balance);
    }

}
