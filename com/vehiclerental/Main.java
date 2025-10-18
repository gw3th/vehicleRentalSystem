package com.vehiclerental;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
        RentalService service = new RentalService();

        // adding sample vehicles to the system
        service.addVehicle(new Car("Toyota Corolla", 5000));
        service.addVehicle(new Car("Toyota Supra MK4", 16000));
        service.addVehicle(new Car("Toyota Prado TX", 7000));
        service.addVehicle(new Car("Honda Civic", 5500));
        service.addVehicle(new Car("lamborghini Urus Perfomante", 20000));
        service.addVehicle(new Car("Nissan Note Nismo E-power", 3200));
        service.addVehicle(new Bike("Yamaha MT-07", 1500));
        service.addVehicle(new Bike("Kawasaki Ninja", 2400));
        service.addVehicle(new Bike("Bajaj Pulsar", 700));
        service.addVehicle(new Van("Nissan Caravan", 8000));
        service.addVehicle(new Van("Mercedes Sprinter", 13500));
        

        Scanner sc = new Scanner(System.in);
        System.out.println("=== VEHICLE RENTAL SYSTEM ===");

        while (true) {
            System.out.println("\n1. View Available Vehicles");
            System.out.println("2. Rent a Vehicle");
            System.out.println("3. Return a Vehicle");
            System.out.println("4. View Rental Records");
            System.out.println("5. Exit");
            
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.println("\n--- Available Vehicles ---");
                    service.listAvailableVehicles();
                }

                case 2 -> {
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter EXACT vehicle model (e.g. Toyota Corolla): ");
                    String model = sc.nextLine();

                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();

                    Customer customer = new Customer(name);
                    System.out.println(service.rentVehicle(customer, model, days));
                }

                case 3 -> {
                    System.out.print("Enter customer name: ");
                    String returnName = sc.nextLine();
                    Customer returnCustomer = new Customer(returnName);
                    System.out.println(service.returnVehicle(returnCustomer));
                }

                case 4 -> {
                    System.out.println("\n---Customer Records---");
                    service.viewAllRecords();
                }


                case 5 -> {
                    System.out.println("Exiting system... Goodbye!");
                    sc.close();
                    return;
                }

                 
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
    
}
