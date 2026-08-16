import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected double baseRate;

    Vehicle(String vehicleNumber, String brand, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    abstract double calculateRentalCost(int days);
}

interface Insurable {
    double getInsuranceCost();
}

class Car extends Vehicle implements Insurable {

    Car(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return (baseRate * days) + 500;
    }

    @Override
    public double getInsuranceCost() {
        return 300;
    }
}

class Bike extends Vehicle {

    Bike(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return baseRate * days;
    }
}

class Truck extends Vehicle implements Insurable {

    Truck(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return (baseRate * days) + 1000;
    }

    @Override
    public double getInsuranceCost() {
        return 800;
    }
}

class RentalAgency {
    private List<Vehicle> vehicles;

    RentalAgency() {
        vehicles = new ArrayList<>();
    }

    void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    void generateBill(String vehicleNumber, int days) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.vehicleNumber.equals(vehicleNumber)) {

                double rentalCost = vehicle.calculateRentalCost(days);
                double insuranceCost = 0;

                if (vehicle instanceof Insurable) {
                    Insurable insurable = (Insurable) vehicle;
                    insuranceCost = insurable.getInsuranceCost();
                }

                double totalCost = rentalCost + insuranceCost;

                System.out.println("\nVehicle Number : " + vehicle.vehicleNumber);
                System.out.println("Brand          : " + vehicle.brand);
                System.out.println("Days           : " + days);
                System.out.println("Rental Cost    : " + rentalCost);
                System.out.println("Insurance Cost : " + insuranceCost);
                System.out.println("Total Bill     : " + totalCost);

                return;
            }
        }

        System.out.println("Vehicle not found.");
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {

        RentalAgency agency = new RentalAgency();

        Car car = new Car("CAR101", "Toyota", 2000);
        Bike bike = new Bike("BIKE101", "Yamaha", 800);
        Truck truck = new Truck("TRUCK101", "Volvo", 5000);

        agency.addVehicle(car);
        agency.addVehicle(bike);
        agency.addVehicle(truck);

        System.out.println("===== CAR RENTAL =====");
        agency.generateBill("CAR101", 3);

        System.out.println("\n===== TRUCK RENTAL =====");
        agency.generateBill("TRUCK101", 2);

        System.out.println("\n===== BIKE RENTAL =====");
        agency.generateBill("BIKE101", 4);
    }
}