// class SecureData {
//    private int accountNumber;
//    private String  accountHolderName;
//    private String mobileNumber;
//    private String accountType;
//    private int balance;

//    SecureData(int acno,String name,String phno,String acctype,int bal)
//    {
//      accountNumber = acno;
//      accountHolderName = name;
//      mobileNumber = phno;
//      accountType = acctype;
//      balance = bal;
//    }

//    public void getters()
//    {
//      System.out.println("Displaying Account Details");
//      System.out.println("Account Number" + accountNumber);
//      System.out.println("AccountHolderName" + accountHolderName);
//      System.out.println("Mobile number" + mobileNumber);
//      System.out.println("Account Type" + accountType);
//      System.out.println("Balanec" + balance);
//    }

   
    
// }

// public class Main
// {
//       public static void main(String[] args) {
//       SecureData sc = new SecureData(101,"Raj","2345678998","Savings",250);
//       sc.getters();  //since the variable is private,we access it using public getters and setters
//    }
// }


class SecureData {
   private int accountNumber;
   private String  accountHolderName;
   private String mobileNumber;
   private String accountType;
   private int balance;

   SecureData(int acno,String name,String phno,String acctype,int bal)
   {
     accountNumber = acno;
     accountHolderName = name;
     mobileNumber = phno;
     accountType = acctype;
     balance = bal;
   }

   public void getters()
   {
     System.out.println("Displaying Account Details");
     System.out.println("Account Number" + accountNumber);
     System.out.println("AccountHolderName" + accountHolderName);
     System.out.println("Mobile number" + mobileNumber);
     System.out.println("Account Type" + accountType);
     System.out.println("Balanec" + balance);
   }
    public static void main(String[] args) {
      SecureData sc = new SecureData(101,"Raj","2345678998","Savings",250);
      System.out.println(sc.accountNumber);  //since this method is a same class member it can be accessed with the obj name
   }
   
    
}



      

