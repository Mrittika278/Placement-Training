import java.util.*;

class Login
{
    String username;
    String password;
    Login(String un,String pw)
    {
        username = un;
        password = pw;
    }
}
public class LoginValdn {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        Login l = new Login("srec","abc@123");
        
        System.out.println("Enter Your Username :");
        String us = ip.nextLine();
        System.out.println("Enter the Password");
        String p = ip.nextLine();

        try {
            if(l.username.equals(us) && l.password.equals(p))
            {
                System.out.println("Login Successful.Welcome " + l.username);
            }
            else if(!l.username.equals(us) && l.password.equals(p))
            {
                    throw new Exception("Invalid username");
            }
            else if(!l.password.equals(p) && l.username.equals(us) )
            {
                throw new Exception("Invalid password");
            }
            else 
            {
                throw new Exception("Invalid Credentials");   
            }
   
            }
        
        
        catch (Exception e) 
        {
             System.out.print(e.getMessage());
        }

    }
    
}