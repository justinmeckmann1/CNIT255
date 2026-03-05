/**
 * Vehicle.java
 * @author Justin Meckmann
 * Purpose: Abstract superclass representing different vehicles
 *          fields:
 *          - speed -> int (km/h)
 *          - fuel  -> double (liters)
 *
 *          Methods:
 *          - accelerate(int kmh)     -> increases speed
 *          - refuel(double liters)   -> increases fuel
 *          
 *          Overrwrites: 
 *          - toString -> forces child classes to implement toString
 */

public abstract class Vehicle {
    private int speed;  // km/h
    private int fuel;   // liters
    
    
    // constructor 
    public Vehicle(int speed, int fuel) {
        this.speed = speed; 
        this.fuel = fuel; 
    }

    // public methods
    public void accelerate(int kmh) {
        this.speed += kmh;
    }

    public void refuel(int liters) {
        this.fuel += liters; 
    }

    // protected getter methods --> only callable by child
    protected int getSpeed() {
        return this.speed; 
    }

    protected int getFuel() {
        return this.fuel; 
    }

    // make sure child classes override toString 
    @Override
    public abstract String toString();
}
