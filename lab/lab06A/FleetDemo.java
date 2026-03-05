/**
* FleetDemo.java
* @author Justin Meckmann
* Purpose:  Demonstrate Truck / Car classes which extend Vehicle
*           Created an array of 4 Vehciles and iterates over them and
            uses println to demonstrate the overwritten toString function
**/



public class FleetDemo {
    public static void main() {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        // define vehicles
        Vehicle[] fleet = {
            new Car(50, 40, '5'),
            new Car(5, 60, 'R'),
            new Truck(75, 120, Truck.Cargo.LIQUID, 6),
            new Truck(80, 150, Truck.Cargo.DRY_BULK, 12)
        };

        // iterate over array and print each vehicle
        for (Vehicle v : fleet) {
            System.out.println(v);
        }
        
    }
}
