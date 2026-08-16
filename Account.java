public class Account {
    static String name = "Mariamman Indian Bank";
    int acc_no;
    String acc_holder;
    Account(int id,String s)
    {
        acc_no = id;
        acc_holder = s;
    }

    void display()
    {
        System.out.println("Bank :" + name);
        System.out.println("Account_number:" + acc_no);
        System.out.println("AccountHoldern:" + acc_holder);
    }

    public static void main(String[] args) {
        Account acc1 = new Account(101,"Rajesh");
        Account acc2 = new Account(102,"Suresh");
        Account acc3 = new Account(103,"Arun");
        
        Account[] arr = {acc1,acc2,acc3};
        for(Account ac : arr)
        {
            ac.display();
        }
      
        System.out.print(Account.name);  //this tells us that the static var can be accessed w/o creating an object
                                         // just by using the class name we can access it 
            


    }
    
}
