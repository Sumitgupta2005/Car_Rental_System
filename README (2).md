# Car Rental System

A simple console-based **Car Rental System** built with Java. This
project demonstrates object-oriented programming (OOP) concepts by
allowing users to view available cars, rent a car, and return a rented
car.

## Features

-   Display available cars with their IDs, brands, and models.
-   Rent an available car for a selected number of days.
-   Calculate the total rental price based on the car's daily rate.
-   Display rental information before confirming a booking.
-   Return a rented car using its car ID.
-   Track car availability during the program session.
-   Manage cars, customers, and rentals using `ArrayList`.

## Technologies Used

-   Java
-   Java Collections Framework (`ArrayList`)
-   Java Scanner for console input

## OOP Concepts Demonstrated

-   **Encapsulation:** Class fields are private and accessed through
    public getter methods.
-   **Constructors:** Used to initialize car, customer, and rental
    objects.
-   **Composition:** A `Rental` object connects a `Car` with a
    `Customer`.
-   **Classes and Objects:** The project is organized into separate
    classes for each responsibility.

## Project Structure

``` text
Car_rental_system/
└── Main.java
```

The `Main.java` file contains these classes:

  -----------------------------------------------------------------------
  Class                               Responsibility
  ----------------------------------- -----------------------------------
  `Car`                               Stores car details, availability,
                                      and daily rental price.

  `Customer`                          Stores customer name and customer
                                      ID.

  `Rental`                            Stores the car, customer, and
                                      number of rental days for a rental.

  `CarRentalSystem`                   Manages cars, customers, rentals,
                                      and the console menu.

  `Main`                              Creates sample cars and starts the
                                      application.
  -----------------------------------------------------------------------

## Getting Started

### Prerequisites

-   Java Development Kit (JDK) installed.
-   A terminal or an IDE such as Visual Studio Code.

Check that Java is installed:

``` bash
java -version
javac -version
```

### Run the Project

1.  Clone this repository:

    ``` bash
    git clone https://github.com/your-username/Car_rental_system.git
    ```

2.  Open the project folder:

    ``` bash
    cd Car_rental_system
    ```

3.  Compile the Java program:

    ``` bash
    javac Main.java
    ```

4.  Run the application:

    ``` bash
    java Main
    ```

## Sample Cars

The application starts with these sample cars:

  Car ID   Brand      Model      Price per Day
  -------- ---------- -------- ---------------
  C001     Toyota     Camry            \$60.00
  C002     Honda      Accord           \$70.00
  C003     Mahindra   Thar            \$150.00

## How to Use

After starting the program, choose an option from the menu:

``` text
====== CAR RENTAL SYSTEM ======
1. Rent a car
2. Return a car
3. Exit
```

-   **Rent a car:** Enter your name, select an available car by its ID,
    enter the rental duration, review the total price, and confirm the
    rental.
-   **Return a car:** Enter the ID of a currently rented car to return
    it.
-   **Exit:** Close the application.

## Current Limitations

-   Data is stored in memory and is reset when the application closes.
-   The project uses sample cars added in the `main` method.
-   It is a console-based application and does not currently include a
    graphical user interface or database.

## Future Improvements

-   Add a database to store cars, customers, and rental records.
-   Add the ability to register new cars.
-   Add input validation and better error handling.
-   Add rental history and invoice generation.
-   Build a graphical user interface.

## Author

**Your Name**

If you found this project useful, feel free to star the repository!
