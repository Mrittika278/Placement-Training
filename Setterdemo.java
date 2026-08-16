class setter {

   int accountNumber;
   String  accountHolderName;
   private String mobileNumber; //mobllenum alone private
   String accountType;
   int balance;
   
   public void setmobilenumber(String num)
   {
      mobileNumber = num;
   }

   public String getMobileNumber()
   {
      return mobileNumber;
   }
   
   setter( int accountNumber,
   String  accountHolderName,
   String accountType,
   int balance)
   {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.accountType = accountType;
    this.balance = balance;
   }

   void display()
   {
    System.out.println("Displaying Account Details");
    System.out.println("Account Number" + accountNumber);
    System.out.println("AccountHolderName" + accountHolderName);
    System.out.println("Account Type" + accountType);
    System.out.println("Balanec" + balance);
   }


    
}

public class Setterdemo
{
   public static void main(String[] args) {
       setter sc = new setter(101,"Joe", "Savings", 1000);
       sc.display();
       sc.setmobilenumber("2123447584");
       System.out.println(sc.getMobileNumber());
   }
}
