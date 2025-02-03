package vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add vehicles to the list
        vehicles.add(new Car("C101", 1000, "CAR12345"));
        vehicles.add(new Bike("B202", 300));
        vehicles.add(new Truck("T303", 2000, "TRUCK56789"));

        // Iterate over the list and calculate costs
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            int rentalDays = 5; // Assume rental for 5 days
            System.out.println("Rental Cost for " + rentalDays + " days: " + vehicle.calculateRentalCost(rentalDays));

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println("---------------------------");
        }
    }
}