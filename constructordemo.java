public class constructordemo {
   int accountNumber;
   String  accountHolderName;
   String mobileNumber;
   String accountType;
   int balance;

   constructordemo( int accountNumber,
   String  accountHolderName,
   String mobileNumber,
   String accountType,
   int balance)
   {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.mobileNumber = mobileNumber;
    this.accountType = accountType;
    this.balance = balance;
   }

   void display()
   {
    System.out.println("Displaying Account Details");
    System.out.println("Account Number" + accountNumber);
    System.out.println("AccountHolderName" + accountHolderName);
    System.out.println("Mobile number" + mobileNumber);
    System.out.println("Account Type" + accountType);
    System.out.println("Balanec" + balance);
   }

   public static void main(String[] args) {
      constructordemo cd = new constructordemo(101,"Joe", "986746726", "Savings", 1000);
      cd.display();
   }
}
