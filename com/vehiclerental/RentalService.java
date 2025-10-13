package com.vehiclerental;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentalService {
    private List<Vehicle> vehicles = new ArrayList<>();
    private Map<Customer, Vehicle> rentedVehicles = new HashMap<>();

    // Add a vehicle to the system
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // List all available vehicles
    public void listAvailableVehicles() {
        boolean anyAvailable = false;
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                System.out.println(v.getModel() + " - " + v.getPricePerDay() + " KES/day");
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No vehicles currently available for rent.");
        }
    }

    // Rent a vehicle based on model name
    public String rentVehicle(Customer customer, String model, int days) {
        for (Vehicle v : vehicles) {
            if (v.getModel().equalsIgnoreCase(model) && v.isAvailable()) {
                v.setAvailable(false);
                rentedVehicles.put(customer, v);

                double cost = v.calculateRentalCost(days);
                return customer.getName() + " rented " + v.getModel() +
                       " for " + days + " days. Total cost: " + cost + " KES.";
            }
        }
        return "Vehicle not available or model not found.";
    }

    // Return a rented vehicle
    public String returnVehicle(Customer customer) {
        if (rentedVehicles.containsKey(customer)) {
            Vehicle v = rentedVehicles.get(customer);
            v.setAvailable(true);
            rentedVehicles.remove(customer);

            return customer.getName() + " successfully returned " + v.getModel() + ".";
        } else {
            return "No record of " + customer.getName() + " renting any vehicle.";
        }
    }

        // Return available vehicles as a string (for displaying in the GUI)
    public String getAvailableVehiclesInfo() {
        StringBuilder sb = new StringBuilder();
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                sb.append(v.getModel())
                  .append(" - ")
                  .append(v.getPricePerDay())
                  .append(" KES/day\n");
            }
        }
        if (sb.length() == 0) {
            sb.append("No vehicles currently available.\n");
        }
        return sb.toString();
    }

}
