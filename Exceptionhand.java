import java.util.*;
// public class Exception
// {
//     public static void main(String[] args) {
//         
//         System.out.println("Enter the integers a and b to divide");
//         int a = ip.nextInt();
//         int b = ip.nextInt();
//         String s = null;
//         int[] arr = {1,2,3,4,5};
//         System.out.println("Welcome");
//         try
//         {
//             System.out.println(a/b);
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("Error " + " " + e);
//         }
//         try
//         {
//             System.out.println(s.charAt(5));
//         }
//         catch(NullPointerException e)
//         {
//             System.out.println("Error " + " " + e);
//         }
//         try
//         {
//             System.out.print(arr[5]);
//         }
//         catch(ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println("Error" + " " + e);
//         }
//         System.out.println("End of the progrm");
//     }
// }

// class BankAccount
// {
//     int balance;
//     BankAccount(int balance)
//     {
//         this.balance = balance;
//     }

//     public void withdrawal(int amt)
//     {
      
//        try
//        {
//           if(amt > balance)
//           {
//             throw new Exception("Insufficient Balance");
//           }
//           else if (balance <= 0)
//           {
//             throw new Exception("Negative Balance");
//           }
//           else
//           {
//              balance -= amt;
//              System.out.println("Rs" + amt + " " + "Withdrawn SuccessFully");
//              System.out.println("Remaining balance :" + balance);
//           }
//        }
//        catch(Exception e)
//        {
//           System.out.println("Error " + e);
//        }
      
//     }

// }

// public class Exceptionhand
// {
//    public static void main(String[] args) {
//         Scanner ip = new Scanner(System.in);
//         BankAccount b = new BankAccount(0);
//         System.out.println("Enter the amount to withdraw");
//         int money = ip.nextInt();
//         b.withdrawal(money);

//    }
// }

// Write a program that shud handle the custom exception for invalid password and incorrect password
//password must have 8 char ..else throw invalid password exception similary the password must have atleast 1 special char atleast one upper and atleast one lower  else throw invalid password exception
//if all these conditions are satisfied then check the password with the stored password if it is not same then throw incorrect password exception yes
class InvalidPasswordException extends Exception
{
    InvalidPasswordException(String str)
    {
        super(str);
    }
}

class IncorrectPasswordException extends Exception
{
    IncorrectPasswordException(String str)
    {
        super(str);
    }
}

class PasswordValidator
{
    String storedPassword;
    PasswordValidator(String sp)
    {
        storedPassword = sp;
    }

    public void validate(String inputPassword) throws InvalidPasswordException, IncorrectPasswordException
    {
        if(inputPassword.length() < 8)
        {
            throw new InvalidPasswordException("Invalid Password: Must be at least 8 characters long.");
        }
        if(!inputPassword.matches(".*[A-Z].*") || !inputPassword.matches(".*[a-z].*") || !inputPassword.matches(".*[!@#$%^&*()].*"))
        {
            throw new InvalidPasswordException("Invalid Password: Must contain at least one uppercase letter, one lowercase letter, and one special character.");
        }
        if(!inputPassword.equals(storedPassword))
        {
            throw new IncorrectPasswordException("Incorrect Password: The password does not match the stored password.");
        }
        System.out.println("Password is valid and correct.");
    }
}

public class Exceptionhand {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        PasswordValidator pv = new PasswordValidator("Abc@1234");
        
        System.out.println("Enter your password:");
        String userInput = ip.nextLine();
        
        try {
            pv.validate(userInput);
        } catch (InvalidPasswordException | IncorrectPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}