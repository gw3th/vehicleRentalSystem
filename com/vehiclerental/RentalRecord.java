package com.vehiclerental;

public class RentalRecord {
    private final Customer customer;
    private final Vehicle vehicle;
    private final int days;
    private final double totalCost;

    // Constructor
    public RentalRecord(Customer customer, Vehicle vehicle, int days, double totalCost) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        this.totalCost = totalCost;
    }

    // Getters
    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getDays() {
        return days;
    }

    public double getTotalCost() {
        return totalCost;
    }

    // Method to display a record nicely
    public void printCustomerRecord() {
        System.out.println("-------------------------------------");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Vehicle: " + vehicle.getModel());
        System.out.println("Days: " + days);
        System.out.println("Total Cost: Ksh " + totalCost);
        System.out.println("-------------------------------------");
    }

    @Override
    public String toString() {
        return "Customer: " + customer.getName() +
               " | Vehicle: " + vehicle.getModel() +
               " | Days: " + days +
               " | Total Cost: Ksh " + totalCost;
    }
}
