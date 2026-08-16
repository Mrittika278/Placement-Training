class Getterdemo {
   private int accountNumber;
   private String accountHolderName;
   private String mobileNumber;
   private String accountType;
   private int balance;

   Getterdemo(int accountNumber,
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

   public int getAccountNumber()
   {
      return accountNumber;
   }

   public String getAccountHolderName()
   {
      return accountHolderName;
   }

   public String getMobileNumber() {
    return mobileNumber;
   }

   public String getAccountType() {
    return accountType;
   }

   public int getBalance() {
    return balance;
   }
   
}

public class Getter
{
      public static void main(String[] args) {
          Getterdemo gd = new Getterdemo(101,"Joe", "986746726", "Savings", 10000);
          System.out.println(gd.getAccountHolderName());
          System.out.println(gd.getAccountNumber());
          System.out.println(gd.getMobileNumber());
          System.out.println(gd.getAccountType());
          System.out.println(gd.getBalance());
          
      }
}


// Create methods such as:

//     getAccountNumber()
//     getAccountHolderName()
//     getMobileNumber()
//     getAccountType()
//     getBalance()

// These methods should return the corresponding values.

// Example:

//     System.out.println(account.getBalance());
