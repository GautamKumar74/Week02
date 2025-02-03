package hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class HospitalPatientManagement {
    public static void main(String[] args) {
        // List to store patients
        List<Patient> patients = new ArrayList<>();

        // Adding patients
        InPatient inPatient = new InPatient("P101", "John Doe", 45, 500.0, 5);
        inPatient.addRecord("Admitted for surgery.");
        inPatient.addRecord("Underwent appendectomy.");

        OutPatient outPatient = new OutPatient("P102", "Jane Smith", 30, 200.0);
        outPatient.addRecord("Visited for general check-up.");
        outPatient.addRecord("Prescribed vitamins.");

        patients.add(inPatient);
        patients.add(outPatient);

        // Processing patient details
        for (Patient patient : patients) {
            patient.getPatientDetails();
            if (patient instanceof MedicalRecord) {
                MedicalRecord medicalRecord = (MedicalRecord) patient;
                medicalRecord.viewRecords();
            }
            System.out.println("Total Bill: $" + patient.calculateBill());
            System.out.println("-------------------------");
        }
    }
}
