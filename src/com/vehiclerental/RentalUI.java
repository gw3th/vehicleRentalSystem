package com.vehiclerental;

import java.awt.*;
import javax.swing.*;

public class RentalUI extends JFrame {
    private final RentalService rentalService;
    private final JTextArea outputArea;

    public RentalUI() {
        // Initialize rental service
        rentalService = new RentalService();

        // ✅ Add default vehicles
// ✅ Add a variety of vehicles
rentalService.addVehicle(new Car("Toyota Corolla", 5000));
rentalService.addVehicle(new Car("Honda Civic", 5500));
rentalService.addVehicle(new Car("Mazda 3", 5200));
rentalService.addVehicle(new Car("Nissan Sylphy", 5100));
rentalService.addVehicle(new Car("Subaru Impreza", 5800));
rentalService.addVehicle(new Car("Toyota Premio", 6000));
rentalService.addVehicle(new Car("BMW 320i", 9500));
rentalService.addVehicle(new Car("Mercedes-Benz C180", 10500));
rentalService.addVehicle(new Car("Audi A4", 11000));
rentalService.addVehicle(new Car("Volkswagen Passat", 8700));
rentalService.addVehicle(new Car("Volkswagen Golf R", 9700));
rentalService.addVehicle(new Car("Toyota Prado TZG", 11100));
// Bikes
rentalService.addVehicle(new Bike("Yamaha MT-07", 1500));
rentalService.addVehicle(new Bike("Bajaj Pulsar", 700));
rentalService.addVehicle(new Bike("Hero Splendor", 600));
rentalService.addVehicle(new Bike("Suzuki Gixxer", 1200));
rentalService.addVehicle(new Bike("Kawasaki Ninja 250", 2500));

// Vans
rentalService.addVehicle(new Van("Nissan Caravan", 8000));
rentalService.addVehicle(new Van("Toyota Hiace", 8500));
rentalService.addVehicle(new Van("Mazda Bongo", 7500));
rentalService.addVehicle(new Van("Mercedes Sprinter", 12000));
rentalService.addVehicle(new Van("Ford Transit", 9500));


        // --- Frame setup ---
        setTitle("🚗 Smart Vehicle Rental System");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center on screen
        setLayout(new BorderLayout(10, 10));

        // --- Title banner ---
        JLabel title = new JLabel("Smart Vehicle Rental System", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 24));
        title.setForeground(new Color(25, 118, 210));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        add(title, BorderLayout.NORTH);

        // --- Output area ---
        outputArea = new JTextArea();
        outputArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        outputArea.setEditable(false);
        outputArea.setBackground(new Color(245, 245, 245));
        outputArea.setMargin(new Insets(10, 10, 10, 10));
        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        add(scrollPane, BorderLayout.CENTER);

        // --- Button panel ---
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 15, 0));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        buttonPanel.setBackground(Color.WHITE);

        JButton showBtn = createStyledButton("Show Available Vehicles", new Color(33, 150, 243));
        JButton rentBtn = createStyledButton("Rent Vehicle", new Color(67, 160, 71));
        JButton returnBtn = createStyledButton("Return Vehicle", new Color(239, 83, 80));

        buttonPanel.add(showBtn);
        buttonPanel.add(rentBtn);
        buttonPanel.add(returnBtn);
        add(buttonPanel, BorderLayout.SOUTH);

        // --- Button Actions ---
        showBtn.addActionListener(e ->
            outputArea.setText(rentalService.getAvailableVehiclesInfo())
        );

        rentBtn.addActionListener(e -> {
            String name = JOptionPane.showInputDialog(this, "Enter your name:");
            if (name == null || name.isBlank()) return;

            String model = JOptionPane.showInputDialog(this, "Enter vehicle model:");
            if (model == null || model.isBlank()) return;

            String daysStr = JOptionPane.showInputDialog(this, "Enter number of days:");
            if (daysStr == null || daysStr.isBlank()) return;

            try {
                int days = Integer.parseInt(daysStr);
                Customer customer = new Customer(name);
                String result = rentalService.rentVehicle(customer, model, days);
                outputArea.setText(result + "\n\n" + rentalService.getAvailableVehiclesInfo());
            } catch (NumberFormatException ex) {
                outputArea.setText("⚠️ Invalid number of days.\n");
            }
        });

        returnBtn.addActionListener(e -> {
            String name = JOptionPane.showInputDialog(this, "Enter your name:");
            if (name == null || name.isBlank()) return;

            Customer customer = new Customer(name);
            String result = rentalService.returnVehicle(customer);
            outputArea.setText(result + "\n\n" + rentalService.getAvailableVehiclesInfo());
        });

        // Show UI
        outputArea.setText(rentalService.getAvailableVehiclesInfo());
        setVisible(true);
    }

    // Helper method to style buttons consistently
    private JButton createStyledButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFocusPainted(false);
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setForeground(Color.WHITE);
        button.setBackground(bgColor);
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.addChangeListener(e -> {
            if (button.getModel().isPressed()) {
                button.setBackground(bgColor.darker());
            } else {
                button.setBackground(bgColor);
            }
        });
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RentalUI::new);
    }
}
