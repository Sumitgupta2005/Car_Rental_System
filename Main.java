
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ================= CAR CLASS =================

class Car {

    private String carID;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;

    public Car(String carID, String brand, String model, double basePricePerDay) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }

    public String getCarID() {
        return carID;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rentCar() {
        isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }

    public double calculateRent(int rentalDays) {
        return basePricePerDay * rentalDays;
    }
}


// ================= CUSTOMER CLASS =================

class Customer {

    private String customerName;
    private int customerId;

    public Customer(String customerName, int customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerId() {
        return customerId;
    }
}


// ================= RENTAL CLASS =================

class Rental {

    private Car car;
    private Customer customer;
    private int days;

    public Rental(Car car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }
}


// ================= CAR RENTAL SYSTEM CLASS =================

class CarRentalSystem {

    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;

    public CarRentalSystem() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public boolean rentCar(Car car, Customer customer, int days) {

        if (car.isAvailable()) {
            car.rentCar();
            rentals.add(new Rental(car, customer, days));
            return true;
        }

        System.out.println("Car is not available for rent.");
        return false;
    }

    public boolean returnCar(Car car) {

        Rental rentalToRemove = null;

        for (Rental rental : rentals) {
            if (rental.getCar() == car) {
                rentalToRemove = rental;
                break;
            }
        }

        if (rentalToRemove != null) {
            car.returnCar();
            rentals.remove(rentalToRemove);
            return true;
        }

        System.out.println("Car was not rented.");
        return false;
    }


    // ================= MENU METHOD =================

    public void menu() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n====== CAR RENTAL SYSTEM ======");
            System.out.println("1. Rent a car");
            System.out.println("2. Return a car");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.println("\n====== RENT A CAR ======");

                System.out.print("Enter your name: ");
                String customerName = sc.nextLine();

                System.out.println("\n====== AVAILABLE CARS ======");

                for (Car car : cars) {
                    if (car.isAvailable()) {
                        System.out.println(
                            car.getCarID() + " - " +
                            car.getBrand() + " " +
                            car.getModel()
                        );
                    }
                }

                System.out.print("\nEnter the car ID you want to rent: ");
                String carId = sc.nextLine();

                System.out.print("Enter the number of rental days: ");
                int rentalDays = sc.nextInt();
                sc.nextLine();

                if (rentalDays <= 0) {
                    System.out.println("Please enter a valid number of days.");
                    continue;
                }

                Car selectedCar = null;

                for (Car car : cars) {
                    if (car.getCarID().equalsIgnoreCase(carId)
                            && car.isAvailable()) {
                        selectedCar = car;
                        break;
                    }
                }

                if (selectedCar != null) {

                    Customer newCustomer = new Customer(
                        customerName,
                        customers.size() + 1
                    );

                    double totalPrice = selectedCar.calculateRent(rentalDays);

                    System.out.println("\n====== RENTAL INFORMATION ======");
                    System.out.println("Customer ID: " + newCustomer.getCustomerId());
                    System.out.println("Customer Name: " + newCustomer.getCustomerName());
                    System.out.println("Car: " + selectedCar.getBrand() + " " +
                            selectedCar.getModel());
                    System.out.println("Rental Days: " + rentalDays);
                    System.out.printf("Total Price: $%.2f%n", totalPrice);

                    System.out.print("\nConfirm rental (Y/N): ");
                    String confirm = sc.nextLine();

                    if (confirm.equalsIgnoreCase("Y")) {

                        addCustomer(newCustomer);

                        if (rentCar(selectedCar, newCustomer, rentalDays)) {
                            System.out.println("\nCar rented successfully!");
                        }

                    } else {
                        System.out.println("\nRental cancelled.");
                    }

                } else {
                    System.out.println("\nInvalid car ID or car is not available.");
                }

            } else if (choice == 2) {

                System.out.println("\n====== RETURN A CAR ======");

                System.out.print("Enter the car ID you want to return: ");
                String carId = sc.nextLine();

                Car carToReturn = null;

                for (Car car : cars) {
                    if (car.getCarID().equalsIgnoreCase(carId)
                            && !car.isAvailable()) {
                        carToReturn = car;
                        break;
                    }
                }

                if (carToReturn != null) {

                    if (returnCar(carToReturn)) {
                        System.out.println("Car returned successfully!");
                    }

                } else {
                    System.out.println("Invalid car ID or car is not rented.");
                }

            } else if (choice == 3) {

                System.out.println("\nThank you for using the Car Rental System!");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}


// ================= MAIN CLASS =================

public class Main {

    public static void main(String[] args) {

        CarRentalSystem rentalSystem = new CarRentalSystem();

        Car car1 = new Car("C001", "Toyota", "Camry", 60.0);
        Car car2 = new Car("C002", "Honda", "Accord", 70.0);
        Car car3 = new Car("C003", "Mahindra", "Thar", 150.0);

        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        rentalSystem.menu();
    }
}
