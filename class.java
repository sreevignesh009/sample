public class hyrarical //parent class
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Child class 1
class Bike extends Vehicle {
    void bikeType() {
        System.out.println("This is a Bike");
    }
}

// Child class 2
class Car extends Vehicle {
    void carType() {
        System.out.println("This is a Car");
    }
}

// Child class 3
class Bus extends Vehicle {
    void busType() {
        System.out.println("This is a Bus");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Bike b = new Bike();
        b.run();        // inherited from Vehicle
        b.bikeType();   // own method

        System.out.println();

        Car c = new Car();
        c.run();        // inherited from Vehicle
        c.carType();    // own method

        System.out.println();

        Bus bu = new Bus();
        bu.run();       // inherited from Vehicle
        bu.busType();   // own method
    }
}