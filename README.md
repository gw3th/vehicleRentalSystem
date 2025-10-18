

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
* 🪟 **User Interface:** Simple, intuitive GUI with buttons, colors, and dynamic updates
* 🧾 **Data Tracking:** Maintains available and rented vehicles in real-time

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
<<<<<<< HEAD
|       ├── RentalRecord.java     # Handling the records
│       └── Main.java             # Console interface
│       
=======
│       ├── Main.java             # Console interface
│       └── RentalUI.java         # Swing GUI interface
>>>>>>> b54e7900c8a4f69ffc954676f7ee45f2c6011c92
│
├── out/                         # Compiled .class files (after build)
└── README.md                    # Project documentation
```

---

<<<<<<< HEAD
=======
### 🧩 **Class Diagram (Simplified)**

```
          +----------------------+
          |      Vehicle         |  ← abstract
          +----------------------+
          | - model: String      |
          | - pricePerDay: double|
          | - available: boolean |
          +----------------------+
          | + getModel()         |
          | + calculateRentalCost() (abstract)
          +----------------------+
                   ▲
        ┌──────────┼──────────┐
        │           │          │
   +---------+  +--------+  +--------+
   |   Car   |  |  Bike  |  |  Van   |
   +---------+  +--------+  +--------+

   +----------------------------------+
   |        RentalService             |
   +----------------------------------+
   | + addVehicle()                   |
   | + listAvailableVehicles()        |
   | + rentVehicle() / returnVehicle()|
   +----------------------------------+

   +------------------------+
   |       Customer         |
   +------------------------+
   | + getName()            |
   | + equals(), hashCode()  |
   +------------------------+
```

---

>>>>>>> b54e7900c8a4f69ffc954676f7ee45f2c6011c92
### 🖥️ **How to Compile and Run**

#### 🧰 Prerequisites

* Java Development Kit (JDK 8 or higher)
* A terminal or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)

#### 🧩 Compile

From the `src` directory:

```bash
javac -d ../out com/vehiclerental/*.java
```

<<<<<<< HEAD
Run Console Version
=======
#### ▶️ Run Console Version
>>>>>>> b54e7900c8a4f69ffc954676f7ee45f2c6011c92

```bash
java -cp ../out com.vehiclerental.Main
```

<<<<<<< HEAD
=======
#### 🪟 Run GUI Version

```bash
java -cp ../out com.vehiclerental.RentalUI
```

---

### 🚘 **Default Vehicles Loaded**

| Type | Model              | Price (KES/day) |
| ---- | ------------------ | --------------- |
| Car  | Toyota Corolla     | 5000            |
| Car  | Honda Civic        | 5500            |
| Car  | BMW 320i           | 9500            |
| Car  | Mercedes-Benz C180 | 10500           |
| Car  | Audi A4            | 11000           |
| Bike | Yamaha MT-07       | 1500            |
| Bike | Bajaj Pulsar       | 700             |
| Bike | Kawasaki Ninja 250 | 2500            |
| Van  | Nissan Caravan     | 8000            |
| Van  | Toyota Hiace       | 8500            |
| Van  | Mercedes Sprinter  | 12000           |

---

### 👨‍💻 **Developed Using**

* **Language:** Java
* **Concepts:** OOP, Polymorphism, Inheritance, Encapsulation, Abstraction
* **Libraries:** Java Swing (GUI), java.util (Collections)

---

### 📚 **Educational Value**

This project is an excellent demonstration of:

* Applying OOP principles in real-world scenarios
* Managing class hierarchies and abstraction
* Building GUIs using Java Swing
* Maintaining logical data relationships (customer ↔ vehicle rentals)





>>>>>>> b54e7900c8a4f69ffc954676f7ee45f2c6011c92

