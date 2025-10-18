

---

## 🚗 Vehicle Rental System

A **Java Object-Oriented Programming (OOP)** project that simulates a simple vehicle rental service — allowing users to view, rent, and return **cars, bikes, and vans**.
It demonstrates key OOP principles such as **encapsulation**, **inheritance**, **abstraction**, and **polymorphism**.

---

### 🧠 **Project Overview**

This project models a vehicle rental system with two user interfaces:

* A **Console-based version** (`Main.java`)
* A **Graphical User Interface (GUI)** (`RentalUI.java`) built using **Java Swing**

Users can:

* View available vehicles
* Rent a vehicle (cars, bikes, or vans)
* Return previously rented vehicles

---

### ⚙️ **Core Features**

* 🔒 **Encapsulation:** Vehicle attributes (model, price, availability) hidden via getters and setters
* 🧬 **Inheritance:** `Car`, `Bike`, and `Van` inherit from the abstract `Vehicle` class
* 🎭 **Polymorphism:** Each vehicle type overrides `calculateRentalCost()`
* 🧩 **Abstraction:** `Vehicle` defines the contract for all vehicle types
* 🪟 **User Interface:** Simple, intuitive TUI with buttons, colors, and dynamic updates
* 🧾 **Data Tracking:** Maintains available and rented vehicles in real-time by using arrays

---

### 🧱 **Project Structure**

```
VehicleRentalSystem/
│
├── src/
│   └── com/vehiclerental/
│       ├── Vehicle.java          # Abstract base class
│       ├── Car.java              # Car subclass
│       ├── Bike.java             # Bike subclass
│       ├── Van.java              # Van subclass
│       ├── Customer.java         # Customer entity
│       ├── RentalService.java    # Core business logic
|       ├── RentalRecord.java     # Handling the records
│       └── Main.java             # Console interface
│       
│
├── out/                         # Compiled .class files (after build)
└── README.md                    # Project documentation
```

---

### 🖥️ **How to Compile and Run**

#### 🧰 Prerequisites

* Java Development Kit (JDK 8 or higher)
* A terminal or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)

#### 🧩 Compile

From the `src i.e the folder containing com/vehiclerental` directory:

```bash
javac -d ../out com/vehiclerental/*.java
```

Run Console Version

```bash
java -cp ../out com.vehiclerental.Main
```


