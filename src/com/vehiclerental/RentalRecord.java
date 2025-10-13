package com.vehiclerental;

public class RentalRecord {
    private Customer customer;
    private Vehicle vehicle;
    private int days;
    private double cost;

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
}
