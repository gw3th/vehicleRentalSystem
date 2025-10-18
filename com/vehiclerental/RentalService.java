package com.vehiclerental;

import java.util.ArrayList;
import java.util.List;

public class RentalService {
    private final List<Vehicle> vehicles = new ArrayList<>();
    private final List<RentalRecord> rentalRecords = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public String rentVehicle(Customer customer, String model, int days) {
        for (Vehicle v : vehicles) {
            if (v.getModel().equalsIgnoreCase(model) && v.isAvailable()) {
                v.setAvailable(false);

                // Use subclass-specific calculation (handles discounts for Bikes)
                double cost = v.calculateRentalCost(days);

                rentalRecords.add(new RentalRecord(customer, v, days, cost));
                return """
                       \u2705 Vehicle rented successfully!
                       Model: """ + v.getModel() + "\n" +
                       "Days: " + days + "\n" +
                       "Total Cost: Ksh " + cost;
            }
        }
        return "Vehicle not available or model not found!";
    }

    public String returnVehicle(Customer customer) {
        for (RentalRecord r : rentalRecords) {
            if (r.getCustomer().getName().equalsIgnoreCase(customer.getName())) {
                r.getVehicle().setAvailable(true);
                return "Vehicle returned successfully for " + customer.getName() + "!";
            }
        }
        return "No record found for customer: " + customer.getName();
    }

    public void viewAllRecords() {
        if (rentalRecords.isEmpty()) {
            System.out.println("No vehicles have been rented yet.");
        } else {
            for (RentalRecord record : rentalRecords) {
                record.printCustomerRecord();
            }
        }
    }

    public void listAvailableVehicles() {
        boolean anyAvailable = false;
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                System.out.println(v.getModel() + " - Ksh " + v.getPricePerDay() + " per day");
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No vehicles are currently available for rent.");
        }
    }
}
