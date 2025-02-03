package vehiclerentalsystem;

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate() + 500; // Additional charge of 500 for trucks
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1; // Insurance = 10% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber;
    }
}
