/**
 * Car.java
 * @author Justin Meckmann
 * Purpose: Extends Vehicle -> car
 *          Fields:
 *          - gear -> char
 *
 *          Inherits methods and fields from superclass:
 *          - speed, fuel, accelerate(), refuel()
 *
 *          Overrides:
 *          - toString()
 */


public class Car extends Vehicle {
    // private int speed;           --> moved to superclass
    // private int fuel;            --> Moved to superclass
    private char gear;
    // private int loadCapacity;    --> only for type Truck
    // private String cargoType;    --> only for type Truck

    // constructor 
    public Car(int speed, int fuel , char gear ) {
        super(speed, fuel); 
        // this.gear = gear; 
    }

    @Override
    public String toString() {
        return String.format("Car @ %d km/h, %d L fuel",
        super.getSpeed(), super.getFuel()); 
    }
}
