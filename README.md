# 🚗 Car Rental System

A console-based **Car Rental Management System** developed using Java. This project allows users to rent cars, return rented cars, check car availability, and calculate rental prices.

Built to practice Java Object-Oriented Programming (OOP) concepts and understand how different classes interact in a real-world application.

## ✨ Features

- 🚘 Display available cars.
- 👤 Register customers during the rental process.
- 🔑 Rent a car using its unique Car ID.
- 💰 Calculate rental costs based on the number of days.
- 🔄 Return rented cars.
- 📋 Display rental information before confirmation.
- ✅ Automatically manage car availability.
- 🗂️ Manage cars, customers, and rentals using ArrayList.

## 🛠️ Technologies Used

- **Language:** Java
- **Collections:** ArrayList
- **Input Handling:** Scanner
- **IDE:** Visual Studio Code

## 📚 OOP Concepts Implemented

This project demonstrates the following Java concepts:

- **Encapsulation:** Using private variables and public getter methods.
- **Constructors:** Initializing objects with constructors.
- **Classes and Objects:** Creating separate classes for cars, customers, and rentals.
- **Composition:** Connecting Customer and Car objects through the Rental class.
- **ArrayList:** Managing collections of cars, customers, and rental records.

## 📁 Project Structure

```text
├── Main.java
└── README.md
```

### Classes Overview

| Class | Description |
|---|---|
| Car | Manages car details, pricing, and availability. |
| Customer | Stores customer information. |
| Rental | Maintains rental details. |
| CarRentalSystem | Handles rental operations and the application menu. |
| Main | Entry point of the application. |

## ⚙️ Installation and Setup

### Prerequisites

- Java JDK installed on your computer.
- Git installed (optional).

Check Java installation:

```bash
java -version
javac -version
```

### Clone the Repository

```bash
git clone https://github.com/Sumitgupta2005/Car_Rental_System.git
```

Navigate to the project directory:

```bash
cd Car_Rental_System
```

### Compile and Run

Compile the Java program:

```bash
javac Main.java
```

Run the application:

```bash
java Main
```

## 🖥️ Application Menu

```text
====== CAR RENTAL SYSTEM ======

1. Rent a car
2. Return a car
3. Exit

Enter your choice:
```

## 🚘 Sample Cars

| Car ID | Brand | Model | Price Per Day |
|---|---|---|---|
| C001 | Toyota | Camry | $60 |
| C002 | Honda | Accord | $70 |
| C003 | Mahindra | Thar | $150 |

## 🔮 Future Improvements

- Database integration using JDBC and MySQL/H2.
- Add new cars dynamically.
- Customer rental history.
- Invoice generation.
- Improved input validation and exception handling.
- Graphical User Interface (GUI).

## 👨‍💻 Author

**Sumitgupta2005**

GitHub: [@Sumitgupta2005](https://github.com/Sumitgupta2005)

---

⭐ If you like this project, consider giving it a star!
