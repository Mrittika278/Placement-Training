class Shapes
{
    void area()
    {
        System.out.println("Area of the Shapes");;
    }

    void area(int side)
    {
        System.out.println("Area of the Square: " + (side * side));
    }

    void area(int length, int breadth)
    {
        System.out.println("Area of the Rectangle: " + (length * breadth));
    }

    void area(double half,int base,int height)
    {
        System.out.println("Area of the triangle : " + ( half * base * height));;
    }
    void area(double pi,int radius)
    {
        System.out.println("Area of the Circle : " + ( pi * radius * radius));
    }
    
}

public class Overloading
{
    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.area();
        s.area(4);
        s.area(10,192);
        s.area(0.5,30,45);
        s.area(3.14,20);
    }
}
