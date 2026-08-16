class BankAccount
{
    void deposit(int amt)
    {
        System.out.println("Deposit is " + amt);
    }

    void deposit(int amt,String Name)
    {
        System.out.println("Deposit is " + amt + " Thank You" + " " +Name);
    }

    void deposit(int amt,String Name,int id)
    {
        System.out.println("Deposit is " + amt + " Thank You" + " " + Name + " Transaction Id" +" " + id);
    }
    void interestcalculation()
    {
        System.out.println("Interest Rate for Savings Account : 6%");
        System.out.println("Interest Rate for Current Account : 2%");
    }
}

class Savings extends BankAccount
{
    void interestcalculation(int amt)
    {
         deposit(amt);
         double interest = 0.06 * amt;
         System.out.println("Interest credited" + " " + interest);
    }
}

class Current extends BankAccount
{
    void interestcalculation(int amt)
    {
         deposit(amt);
         double interest = 0.02 * amt;
         System.out.println("Interest : " + " " + interest);
    }
}


public class Overloading_Overriding {
    public static void main(String[] args) {
        Savings s = new Savings();
        s.interestcalculation();
        s.interestcalculation(10000);
        Current c = new Current();
        c.interestcalculation(20000);
        c.deposit(500);
        c.deposit(1000,"Mrittika");
        c.deposit(5000,"Mrittika",12345);
    }
    
}
