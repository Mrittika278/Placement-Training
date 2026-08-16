abstract class Employee {

    // Private variables - Encapsulation
    private int id;
    private String name;
    private double basicSalary;

    // Constructor 1
    Employee() {
        id = 0;
        name = "Unknown";
        basicSalary = 0.0;
    }

    // Constructor 2 - overloaded
    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Abstract method
    abstract double calculateSalary();

    // Normal method
    public void displayDetails() {
        System.out.println("ID           : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Final Salary : " + calculateSalary());
    }
}


// Doctor class
class Doctor extends Employee {

    private double consultationAllowance;

    // Overloaded constructor 1
    Doctor() {
        super();
        consultationAllowance = 0.0;
    }

    // Overloaded constructor 2
    Doctor(int id, String name, double basicSalary,
           double consultationAllowance) {

        super(id, name, basicSalary);
        this.consultationAllowance = consultationAllowance;
    }

    public double getConsultationAllowance() {
        return consultationAllowance;
    }

    public void setConsultationAllowance(double consultationAllowance) {
        this.consultationAllowance = consultationAllowance;
    }

    // Method overriding
    @Override
    double calculateSalary() {
        return getBasicSalary() + consultationAllowance;
    }
}


// Nurse class
class Nurse extends Employee {

    private double nightShiftAllowance;

    // Overloaded constructor 1
    Nurse() {
        super();
        nightShiftAllowance = 0.0;
    }

    // Overloaded constructor 2
    Nurse(int id, String name, double basicSalary,
          double nightShiftAllowance) {

        super(id, name, basicSalary);
        this.nightShiftAllowance = nightShiftAllowance;
    }

    public double getNightShiftAllowance() {
        return nightShiftAllowance;
    }

    public void setNightShiftAllowance(double nightShiftAllowance) {
        this.nightShiftAllowance = nightShiftAllowance;
    }

    // Method overriding
    @Override
    double calculateSalary() {
        return getBasicSalary() + nightShiftAllowance;
    }
}


// Lab Technician class
class LabTechnician extends Employee {

    private double labAllowance;

    // Overloaded constructor 1
    LabTechnician() {
        super();
        labAllowance = 0.0;
    }

    // Overloaded constructor 2
    LabTechnician(int id, String name, double basicSalary,
                  double labAllowance) {

        super(id, name, basicSalary);
        this.labAllowance = labAllowance;
    }

    public double getLabAllowance() {
        return labAllowance;
    }

    public void setLabAllowance(double labAllowance) {
        this.labAllowance = labAllowance;
    }

    // Method overriding
    @Override
    double calculateSalary() {
        return getBasicSalary() + labAllowance;
    }
}


// Main class
public class HospitalEmployeeManagement {

    // Bonus method
    public static Employee findHighestPaid(Employee[] employees) {

        Employee highest = employees[0];

        for (Employee emp : employees) {

            if (emp.calculateSalary() > highest.calculateSalary()) {
                highest = emp;
            }
        }

        return highest;
    }

    public static void main(String[] args) {

        // Employee array containing different child objects
        Employee[] employees = {
            new Doctor(101, "Arun", 80000, 20000),
            new Nurse(102, "Priya", 40000, 8000),
            new LabTechnician(103, "Rahul", 45000, 10000),
            new Doctor(104, "Meena", 90000, 25000)
        };

        System.out.println("===== HOSPITAL EMPLOYEE DETAILS =====");

        for (Employee emp : employees) {

            emp.displayDetails();

            System.out.println("-----------------------------");
        }

        // Find highest-paid employee
        Employee highest = findHighestPaid(employees);

        System.out.println("\n===== HIGHEST PAID EMPLOYEE =====");

        System.out.println("Name         : " + highest.getName());
        System.out.println("ID           : " + highest.getId());
        System.out.println("Final Salary : " + highest.calculateSalary());
    }
}