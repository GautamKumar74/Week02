package singleinheritance.smarthomedevices;

public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create a Thermostat object
        Thermostat thermostat = new Thermostat("T1001", "Active", 22.5);

        // Call displayStatus() to show the thermostat's current settings
        thermostat.displayStatus();
    }
}
