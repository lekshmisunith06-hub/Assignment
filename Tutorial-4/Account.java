import java.util.Scanner;

public class Account{

    long accountNumber;
    String accountHolder;
    double balance;

Account(long accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        Account acc = new Account(accNo, name, bal);

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        acc.deposit(amount);

        System.out.println("\nUpdated Account Details");

        acc.displayDetails();

        sc.close();
    }
}
