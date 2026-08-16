abstract class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    abstract int calcdisc(int price);  
}

class Electronics extends Product
{

   Electronics(int id,String name,int price)
   {
     super(id, name, price);
   }
   @Override
   int calcdisc(int price)
   {
      return price - (int)0.10 * price;
   }

}

class Grocery extends Product
{

   Grocery(int id,String name,int price)
   {
     super(id, name, price);
   }
   @Override
   int calcdisc(int price)
   {
      return price - (int)0.10 * price;
   }

}

class Clothing extends Product
{

   Clothing(int id,String name,int price)
   {
     super(id, name, price);
   }
   @Override
   int calcdisc(int price)
   {
      return price - (int)0.10 * price;
   }

}

public class ecommerce

{
    
}