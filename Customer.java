import java.util.*;
public class Customer {

    String id;
    String name;
    int amount;
    public Customer(String id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public void display()
    {
        System.out.println("Purchase_id :" + " " + id);
        System.out.println("Customer Name " + " " +name);
        System.out.println("Bill Amount" + " " + amount);
    }
    public static void main(String[] args) {
        Customer c1 = new Customer("1","Mrittika" , 1500000);
        Customer c2 = new Customer("2", "Meera", 20000);
        Customer c3 = new Customer("5", "Mouna", 250000);
        Customer c4 = new Customer("12", "Riya", 12000);
        ArrayList<Customer> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        ListIterator<Customer> it =  list.listIterator();

        while(it.hasNext())
        {
            it.next().display();
        }

         
    }

    
}
