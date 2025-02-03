package assistedproblems.vehicleandtransportsystem;

class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Info: Max Speed = " + maxSpeed + " km/h, Fuel Type = " + fuelType + ", Load Capacity = " + loadCapacity + " tons");
    }
}
