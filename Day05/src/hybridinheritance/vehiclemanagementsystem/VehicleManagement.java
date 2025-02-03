package hybridinheritance.vehiclemanagementsystem;

public class VehicleManagement {
    public static void main(String[] args) {
        // Create an ElectricVehicle object
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);

        // Create a PetrolVehicle object
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);

        // Display details and specific behavior for ElectricVehicle
        System.out.println("Electric Vehicle Details:");
        ev.displayDetails();
        ev.charge();
        System.out.println();

        // Display details and specific behavior for PetrolVehicle
        System.out.println("Petrol Vehicle Details:");
        pv.displayDetails();
        pv.refuel();
    }
}
