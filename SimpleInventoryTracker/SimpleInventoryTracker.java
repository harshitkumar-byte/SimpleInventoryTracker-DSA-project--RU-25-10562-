
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println(id + "\t" + name + "\t" 
                + quantity + "\t" + price);
    }
}

public class SimpleInventoryTracker {

    static ArrayList<Product> inventory = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Add Product
    static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        inventory.add(new Product(id, name, quantity, price));

        System.out.println("Product added successfully!");
    }

    // Display Products
    static void displayProducts() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }

        System.out.println("\nID\tName\tQuantity\tPrice");

        for (Product p : inventory) {
            p.display();
        }
    }

    // Search Product
    static void searchProduct() {
        System.out.print("Enter Product ID to search: ");
        int id = sc.nextInt();

        boolean found = false;

        for (Product p : inventory) {
            if (p.id == id) {
                System.out.println("Product Found:");
                p.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found!");
        }
    }

    // Sort Products by Name
    static void sortByName() {
        Collections.sort(inventory,
            Comparator.comparing(p -> p.name.toLowerCase()));

        System.out.println("Products sorted by name!");
        displayProducts();
    }

    // Sort Products by Price
    static void sortByPrice() {
        Collections.sort(inventory,
            Comparator.comparingDouble(p -> p.price));

        System.out.println("Products sorted by price!");
        displayProducts();
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== INVENTORY TRACKER =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Sort by Name");
            System.out.println("5. Sort by Price");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;

                case 2:
                    displayProducts();
                    break;

                case 3:
                    searchProduct();
                    break;

                case 4:
                    sortByName();
                    break;

                case 5:
                    sortByPrice();
                    break;

                case 6:
                    System.out.println("Exiting Inventory Tracker...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
