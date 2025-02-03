package assistedproblems.vehicleandtransportsystem;

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        // Create objects of different subclasses
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 10);
        Vehicle motorcycle = new Motorcycle(150, "Petrol", "sports");

        // Store objects in an array of Vehicle type
        Vehicle[] vehicles = {car, truck, motorcycle};

        // Demonstrate polymorphism by calling displayInfo() on each object
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}
