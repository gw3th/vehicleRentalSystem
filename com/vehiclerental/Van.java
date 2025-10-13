package com.vehiclerental;

public class Van extends Vehicle {
    public Van(String model, double pricePerDay) {
        super(model, pricePerDay);
    }

    @Override
    public double calculateRentalCost(int days) {
        double base = getPricePerDay() * days;
        double insuranceFee = 500; // flat extra charge example
        return base + insuranceFee;
    }
}
