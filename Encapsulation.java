abstract class Employee
{
    private String Name;
    private Double Salary;
    public void setName(String name)
    {
        Name = name;
    }
    public String getname()
    {
        return Name;
    }

    public void setSalary(Double Salary)
    {
        this.Salary = Salary;
    }

    public Double getSalary()
    {
        return Salary;
    }
    abstract void Bonus_cal();

    abstract void display_all();
    
}

class Developer extends Employee
{
    public void fullstack()
    {
        System.out.println("Salary of Full Stack Developer is " + " " + (getSalary() + 5000));
    }

    public void mernstack()
    {
        System.out.println("Salary of a MernStack Developer is " + " " + (getSalary() + 10000));
    }

    @Override
    public void Bonus_cal()
    {
        double s = getSalary() * 0.06;
        System.out.println("Bonus " + " " + s);
    }
    @Override
    public void display_all()
    {
        System.out.println("Salary : " + getSalary());
        Bonus_cal();
    }
}



