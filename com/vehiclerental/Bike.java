package com.vehiclerental;

public class Bike extends Vehicle {
    public Bike(String model, double pricePerDay) {
        super(model, pricePerDay);
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getPricePerDay() * days;

        // Example: 10% discount for rentals longer than 5 days
        if (days >= 5) {
            cost *= 0.9;
        }
        return cost;
    }
}
