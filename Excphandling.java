// import java.util.Scanner;
// class Customexcep extends Exception   //this is compile time excepn so it forces u to handle it using try catch or throws
// {
//     public Customexcep(String str)
//     {
//         super(str);
//     }
// }
// class BankAcc
// {
//     int balance;
//     BankAcc(int balance)
//     {
//         this.balance = balance;
//     }

//     public void withdrawal(int amt) throws Customexcep   
//     {
      
//        if(amt > balance)
//        {
//          throw new Customexcep("Insufficient Balance");
//        }
//        else
//        {
//         balance -= amt;
//         System.out.println("Withdrawal Successful. New Balance: " + balance);
//        }
//     }
// }
// public class Excphandling{

//     public static void main(String[] args) {
//         Scanner ip = new Scanner(System.in);
//         BankAcc account = new BankAcc(1000);
//         System.out.println("Enter the amount to withdraw:");
//         int amount = ip.nextInt();
//         try 
//         {
//             account.withdrawal(amount);
//         }
//         catch (Customexcep e) 
//         {
//             System.out.println("Error: " + e.getMessage());
//         }
        
        
//     }

    
// }
// import java.util.Scanner;
// class Customexcep extends RuntimeException   //this is compile time excepn so it forces u to handle it using try catch or throws
// {
//     public Customexcep(String str)
//     {
//         super(str);
//     }
// }
// class BankAcc
// {
//     int balance;
//     BankAcc(int balance)
//     {
//         this.balance = balance;
//     }
//     public void withdrawal(int amt) throws Customexcep   
//     {
      
//        if(amt > balance)
//        {
//          throw new Customexcep("Insufficient Balance");
//        }
//        else
//        {
//         balance -= amt;
//         System.out.println("Withdrawal Successful. New Balance: " + balance);
//        }
//     }
// }
// public class Excphandling{

//     public static void main(String[] args) {
//         Scanner ip = new Scanner(System.in);
//         BankAcc account = new BankAcc(1000);
//         System.out.println("Enter the amount to withdraw:");
//         int amount = ip.nextInt();
//         account.withdrawal(amount);
        
//     }

    
// }
// 
import java.util.Scanner;