import java.util.*;

class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;
    private int pin;

    BankAccount(int accountNumber, String holderName, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.pin = pin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void checkBalance() {
        System.out.println("Balance: ₹" + balance);
    }

    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(int accountNumber, String holderName, double balance,
                   int pin, double interestRate) {
        super(accountNumber, holderName, balance, pin);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    CurrentAccount(int accountNumber, String holderName, double balance,
                   int pin, double overdraftLimit) {
        super(accountNumber, holderName, balance, pin);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}

class ATM {
    private int atmId;
    private String location;
    private double cashAvailable;
    private BankAccount account;

    ATM(int atmId, String location, double cashAvailable) {
        this.atmId = atmId;
        this.location = location;
        this.cashAvailable = cashAvailable;
    }

    public void insertCard(BankAccount account) {
        this.account = account;
        System.out.println("Card inserted successfully.");
    }

    public boolean enterPin(int pin) {
        if (account != null && account.getPin() == pin) {
            System.out.println("Login Successful!");
            return true;
        }

        System.out.println("Invalid PIN.");
        return false;
    }

    public void checkBalance() {
        account.checkBalance();
    }

    public void withdrawCash(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > cashAvailable) {
            System.out.println("ATM does not have sufficient cash.");
        } else if (amount > account.getBalance()) {
            if (!(account instanceof CurrentAccount)) {
                System.out.println("Insufficient balance.");
                return;
            }

            CurrentAccount current = (CurrentAccount) account;

            if (amount > account.getBalance() + current.getOverdraftLimit()) {
                System.out.println("Withdrawal exceeds overdraft limit.");
                return;
            }

            account.withdraw(amount);
            cashAvailable -= amount;
            System.out.println("Processing...");
            System.out.println("₹" + amount + " withdrawn successfully.");
            System.out.println("Remaining Balance: ₹" + account.getBalance());
        } else {
            account.withdraw(amount);
            cashAvailable -= amount;
            System.out.println("Processing...");
            System.out.println("₹" + amount + " withdrawn successfully.");
            System.out.println("Remaining Balance: ₹" + account.getBalance());
        }
    }

    public void depositCash(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        account.deposit(amount);
        cashAvailable += amount;

        System.out.println("₹" + amount + " deposited successfully.");
        System.out.println("Updated Balance: ₹" + account.getBalance());
    }

    public void displayAccountDetails() {
        account.displayDetails();
    }

    public void exit() {
        System.out.println("Card removed.");
        System.out.println("Thank you for using the ATM.");
    }
}

public class ATMSystem {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        BankAccount account1 =
            new SavingsAccount(1001, "Mrittika", 30000, 1234, 4.5);

        BankAccount account2 =
            new CurrentAccount(1002, "Arun", 50000, 5678, 20000);

        ATM atm = new ATM(101, "Coimbatore", 500000);

        System.out.print("Enter Account Number: ");
        int accNo = ip.nextInt();

        BankAccount selectedAccount = null;

        if (accNo == account1.getAccountNumber()) {
            selectedAccount = account1;
        } else if (accNo == account2.getAccountNumber()) {
            selectedAccount = account2;
        } else {
            System.out.println("Account not found.");
            return;
        }

        atm.insertCard(selectedAccount);

        System.out.print("Enter PIN: ");
        int pin = ip.nextInt();

        if (!atm.enterPin(pin)) {
            return;
        }

        int choice;

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = ip.nextInt();

            switch (choice) {

                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount: ₹");
                    double withdrawAmount = ip.nextDouble();
                    atm.withdrawCash(withdrawAmount);
                    break;

                case 3:
                    System.out.print("Enter amount: ₹");
                    double depositAmount = ip.nextDouble();
                    atm.depositCash(depositAmount);
                    break;

                case 4:
                    atm.displayAccountDetails();
                    break;

                case 5:
                    atm.exit();
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        ip.close();
    }
}