package vehiclerentalsystem;

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate(); // Cost = days * rental rate
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // Insurance = 5% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber;
    }
}
