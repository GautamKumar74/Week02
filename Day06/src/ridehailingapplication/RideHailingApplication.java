package ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

public class RideHailingApplication {
    public static void main(String[] args) {
        // List of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Adding vehicles
        Car car = new Car("C101", "John Doe", 10.0, "Downtown");
        Bike bike = new Bike("B202", "Jane Smith", 5.0, "Uptown");
        Auto auto = new Auto("A303", "Mike Brown", 7.0, "Midtown");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Displaying vehicle details and calculating fares
        double distance = 15.0; // Example distance in kilometers
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("New Destination");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }
            System.out.println("Fare for " + distance + " km: $" + vehicle.calculateFare(distance));
            System.out.println("-------------------------");
        }
    }
}