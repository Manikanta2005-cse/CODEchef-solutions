class Vehicle {
    public void startEngine() {
        System.out.println("Vehicle engine starting...");
    }
}

// Subclass Car inheriting from Vehicle
class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine starting with a roar...");
    }
}

// Subclass Motorcycle inheriting from Vehicle
class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine starting with a vroom...");
    }
}

class Codechef {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.startEngine(); // From Vehicle

        Car myCar = new Car();
        myCar.startEngine(); // Overridden in Car

        Motorcycle myMotorcycle = new Motorcycle();
        myMotorcycle.startEngine(); // Overridden in Motorcycle
    }
}