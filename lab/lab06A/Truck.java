/**
 * Truck.java
 * @author Justin Meckmann
 * Purpose: Extends Vehicle -> Truck
 *          Fields:
 *          - loadCapacity -> int
 *          - cargoType -> enum Cargo
 *
 *          Inherits methods and fields from superclass:
 *          - speed, fuel, accelerate(), refuel()
 *
 *          Overrides:
 *          - toString()
 */



public class Truck extends Vehicle{
    private int loadCapacity;
    private Cargo cargoType; 

    public enum Cargo {
        DRY_BULK, LIQUID, REFRIGERATED
    }

    public Truck(int speed, int fuel, Cargo cargoType, int loadCapacity) {
        super(speed, fuel); // call superclass constructor 
        this.cargoType = cargoType;         // Cargo type enum
        this.loadCapacity = loadCapacity;   // tons
    }

    @Override
    public String toString() {
        return String.format("Truck (%s, %d t) @ %d km/h, %d L fuel",
        this.cargoType.name(), this.loadCapacity, super.getSpeed(), super.getFuel()); 
    }
}
