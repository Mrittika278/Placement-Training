import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String customerName;
    String accountType;
    double balance;

    BankAccount(int accountNumber, String customerName, String accountType) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        this.balance = 0;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited into Account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance in Account " + accountNumber);
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Account " + accountNumber);
        }
    }

    void transfer(BankAccount receiver, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid transfer amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance in Account " + accountNumber);
        } else {
            balance -= amount;
            receiver.balance += amount;

            System.out.println("₹" + amount + " transferred from Account "
                    + accountNumber + " to Account " + receiver.accountNumber);
        }
    }

    void displayDetails() {
        System.out.println("----------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : ₹" + balance);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {

        BankAccount account101 =
                new BankAccount(101, "Mrittika", "Savings");

        BankAccount account102 =
                new BankAccount(102, "Rahul", "Savings");

        BankAccount account103 =
                new BankAccount(103, "Priya", "Current");

        System.out.println("===== TRANSACTIONS =====");

        account101.deposit(10000);

        account102.deposit(5000);

        account101.transfer(account102, 3000);

        account102.withdraw(2000);

        account103.deposit(8000);

        account103.transfer(account101, 2000);

        System.out.println("\n===== FINAL ACCOUNT DETAILS =====");

        account101.displayDetails();
        account102.displayDetails();
        account103.displayDetails();
    }
}