package com.vehiclerental;

public class Car extends Vehicle {
    public Car(String model, double pricePerDay) {
        super(model, pricePerDay);
    }

    @Override
    public double calculateRentalCost(int days) {
        // Simple flat rate
        return getPricePerDay() * days;
    }
}
