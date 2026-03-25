// Interface
interface Maintenance {
    void service();
}

// Abstract Class
abstract class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }

    abstract void startEngine();
}

// Parent Class
class Car extends Vehicle implements Maintenance {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    void startEngine() {
        System.out.println("Car engine started with key ignition.");
    }

    @Override
    public void service() {
        System.out.println("Car needs servicing every 6 months.");
    }

    void showCarDetails() {
        displayInfo();
        System.out.println("Doors: " + doors);
    }
}

// Child Class (Multi-level Inheritance)
class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int speed, int doors, int batteryCapacity) {
        super(brand, speed, doors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void startEngine() {
        System.out.println("Electric car starts silently with button.");
    }

    void showElectricDetails() {
        super.showCarDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Another Child Class
class SportsCar extends Car {
    int topSpeed;

    SportsCar(String brand, int speed, int doors, int topSpeed) {
        super(brand, speed, doors);
        this.topSpeed = topSpeed;
    }

    @Override
    void startEngine() {
        System.out.println("Sports car roars to life!");
    }

    void showSportsDetails() {
        super.showCarDetails();
        System.out.println("Top Speed: " + topSpeed);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new ElectricCar("Tesla", 150, 4, 75);
        Vehicle v2 = new SportsCar("Ferrari", 220, 2, 320);

        System.out.println("---- Electric Car ----");
        v1.startEngine();

        System.out.println("\n---- Sports Car ----");
        v2.startEngine();

        System.out.println("\n---- Full Details ----");

        ElectricCar ec = new ElectricCar("Tesla", 150, 4, 75);
        ec.showElectricDetails();
        ec.service();

        System.out.println();

        SportsCar sc = new SportsCar("Ferrari", 220, 2, 320);
        sc.showSportsDetails();
        sc.service();
    }
}