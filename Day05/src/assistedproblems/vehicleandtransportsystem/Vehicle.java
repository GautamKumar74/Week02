package assistedproblems.vehicleandtransportsystem;

class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Vehicle Info: Max Speed = " + maxSpeed + " km/h, Fuel Type = " + fuelType);
    }
}