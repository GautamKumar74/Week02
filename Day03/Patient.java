class Patient {
    // Static variable shared among all patients
    static String hospitalName = "City Hospital";

    // Static variable to track the total number of patients
    private static int totalPatients = 0;

    // Static method to get the total number of patients
    static int getTotalPatients() {
        return totalPatients;
    }

    // Instance variables
    private String name;
    private int age;
    private String ailment;
    private final int patientID; // Final variable to ensure patientID is immutable

    // Constructor using 'this' to initialize instance variables
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increment the total number of patients
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) { // Using 'instanceof' to check the object type
            System.out.println("Patient ID: " + this.patientID);
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Ailment: " + this.ailment);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("The object is not an instance of Patient.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Display the hospital name
        System.out.println("Hospital Name: " + Patient.hospitalName);

        // Creating patient objects
        Patient patient1 = new Patient(101, "John Doe", 30, "Flu");
        Patient patient2 = new Patient(102, "Jane Smith", 25, "Migraine");

        // Displaying patient details
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        // Displaying the total number of patients
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
    }
}
