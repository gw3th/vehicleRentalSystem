package com.vehiclerental;

public abstract class Vehicle {
    private String model;
    private double pricePerDay;
    private boolean available;

    public Vehicle(String model, double pricePerDay) {
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.available = true;
    }

    // Encapsulation: getters & setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Abstraction/Polymorphism: subclasses must implement rental cost calculation
    public abstract double calculateRentalCost(int days);

    @Override
    public String toString() {
        return getClass().getSimpleName() + " | Model: " + model +
                " | Price/day: " + pricePerDay +
                " | Available: " + (available ? "Yes" : "No");
    }
}
