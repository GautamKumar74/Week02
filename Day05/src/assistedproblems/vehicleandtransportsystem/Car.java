package assistedproblems.vehicleandtransportsystem;

class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Info: Max Speed = " + maxSpeed + " km/h, Fuel Type = " + fuelType + ", Seat Capacity = " + seatCapacity);
    }
}
