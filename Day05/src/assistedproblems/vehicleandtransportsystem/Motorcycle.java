package assistedproblems.vehicleandtransportsystem;

class Motorcycle extends Vehicle {
    private String bikeType;

    public Motorcycle(int maxSpeed, String fuelType, String bikeType) {
        super(maxSpeed, fuelType);
        this.bikeType = bikeType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Info: Max Speed = " + maxSpeed + " km/h, Fuel Type = " + fuelType + ", " +
                "Bike Type = " + bikeType);
    }
}

