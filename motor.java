class Vehicle {
    String make;
    String model;
    int year;
    int num_wheels;

    Vehicle(String make, String model, int year, int num_wheels) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.num_wheels = num_wheels;
    }

    void displayDetails() {
        System.out.println("Vehicle Details: " + make + " " + model + ", Year: " + year + ", Wheels: " + num_wheels);
    }
}

interface Engine {
    String getType();
    int getHorsepower();
    String getFuelType();
}

class Car extends Vehicle implements Engine {
    String type;
    int horsepower;
    String fuel_type;

    Car(String make, String model, int year, int num_wheels, String type, int horsepower, String fuel_type) {
        super(make, model, year, num_wheels);
        this.type = type;
        this.horsepower = horsepower;
        this.fuel_type = fuel_type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String getFuelType() {
        return fuel_type;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Type: " + getType() + ", Horsepower: " + getHorsepower() + ", Fuel Type: " + getFuelType());
    }
}

class Truck extends Vehicle implements Engine {
    String type;
    int horsepower;
    String fuel_type;

    Truck(String make, String model, int year, int num_wheels, String type, int horsepower, String fuel_type) {
        super(make, model, year, num_wheels);
        this.type = type;
        this.horsepower = horsepower;
        this.fuel_type = fuel_type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String getFuelType() {
        return fuel_type;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Type: " + getType() + ", Horsepower: " + getHorsepower() + ", Fuel Type: " + getFuelType());
    }
}

class Motorcycle extends Vehicle implements Engine {
    String type;
    int horsepower;
    String fuel_type;

    Motorcycle(String make, String model, int year, int num_wheels, String type, int horsepower, String fuel_type) {
        super(make, model, year, num_wheels);
        this.type = type;
        this.horsepower = horsepower;
        this.fuel_type = fuel_type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String getFuelType() {
        return fuel_type;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Type: " + getType() + ", Horsepower: " + getHorsepower() + ", Fuel Type: " + getFuelType());
    }
}

public class motor {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2023, 4, "V6", 300, "Gasoline");
        Truck truck = new Truck("Ford", "F-150", 2023, 4, "V8", 450, "Diesel");
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2023, 2, "V-Twin", 55, "Gasoline");

        car.displayDetails();
        truck.displayDetails();
        motorcycle.displayDetails();
    }
}

