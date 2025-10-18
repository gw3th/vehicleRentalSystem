

---



Users can:

* View available vehicles
* Rent a vehicle (cars, bikes, or vans)
* Return previously rented vehicles
* View rental history

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
vehicleRentalSystemTUI-main/
│
├── vehicleRentalSystemTUI-main/
│   └── com/vehiclerental/
│       ├── Vehicle.java          # Abstract base class(parent class)
│       ├── Car.java              # Car subclass
│       ├── Bike.java             # Bike subclass
│       ├── Van.java              # Van subclass
│       ├── Customer.java         # Customer entity
│       ├── RentalService.java    # Core business logic
|       ├── RentalRecord.java     # Handling the rental records
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

From a terminal;
From the `vehicleRentalSystemTUI-main i.e the folder containing com/vehiclerental` directory: (run; cd vehicleRentalSystemTUI-main)
<img width="1919" height="1078" alt="image" src="https://github.com/user-attachments/assets/32c1f745-25be-4969-bf18-5b12364db41a" />


```bash
javac -d ../out com/vehiclerental/*.java
```

Run Console Version

```bash
java -cp ../out com.vehiclerental.Main
```


