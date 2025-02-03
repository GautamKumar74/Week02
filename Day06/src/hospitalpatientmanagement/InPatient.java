package hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int daysAdmitted;
    private List<String> medicalRecords;

    public InPatient(String patientId, String name, int age, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return dailyCharge * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for In-Patient: ");
        for (String record : medicalRecords) {
            System.out.println(record);
        }
    }
}
