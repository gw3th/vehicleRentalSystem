package com.vehiclerental;

public class RentalRecord {
    private final Customer customer;
    private final Vehicle vehicle;
    private final int days;
    private final double cost;

    public RentalRecord(Customer customer, Vehicle vehicle, int days, double cost) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        this.cost = cost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getDays() {
        return days;
    }

    public double getCost() {
        return cost;
    }

    public void printCustomerRecord() {
        System.out.println("Vehicle: " + vehicle.getModel() + " \t | Customer: " + customer.getName() + " \t| Days: " + days +" \t| Total Cost: Ksh " + cost
        );
    }
}
