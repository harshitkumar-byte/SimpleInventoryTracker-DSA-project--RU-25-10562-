# Simple Inventory Tracker

## Project Overview

The Simple Inventory Tracker is a console-based application developed using Java. It allows users to add products, view available inventory, search for products, and sort products based on their name and price.

The project demonstrates the implementation of Java Collections Framework concepts such as ArrayList, along with searching, sorting, and Object-Oriented Programming (OOP).

## Features

- Add new products to the inventory.
- View all available products.
- Search products using Product ID.
- Sort products alphabetically by name.
- Sort products based on price.
- Store multiple product records dynamically.
- Display product details, including ID, name, quantity, and price.
- Provide a simple menu-driven interface.
- Handle invalid menu choices.

## Technologies Used

- **Programming Language:** Java
- **Collections:** ArrayList
- **Concepts:** Searching, Sorting, OOP
- **Input Handling:** Scanner
- **IDE:** VS Code

## Java Concepts Implemented

| Concept | Implementation |
|---|---|
| ArrayList | Stores product details dynamically |
| Searching | Searches products using Product ID |
| Sorting | Sorts products by name and price |
| Classes & Objects | Product and InventoryTracker classes |
| Encapsulation basics | Uses a Product class to organize product details |
| Loops | Iterates through the inventory |
| Switch Case | Handles different menu options |
| Collections | Uses Collections.sort() for sorting |

## Project Structure

```text
SimpleInventoryTracker/
│
└── InventoryTracker.java
```

## How to Run the Project

### 1. Clone the Repository

```bash
git clone <your-repository-url>
```

### 2. Navigate to the Project Directory

```bash
cd SimpleInventoryTracker
```

### 3. Compile the Java File

```bash
javac InventoryTracker.java
```

### 4. Run the Application

```bash
java InventoryTracker
```

## Application Menu

```text
===== INVENTORY TRACKER =====

1. Add Product
2. Display Products
3. Search Product
4. Sort by Name
5. Sort by Price
6. Exit

Enter your choice:
```

## Sample Product Details

| Product ID | Product Name | Quantity | Price |
|---|---|---:|---:|
| 101 | Laptop | 10 | ₹45,000 |
| 102 | Mouse | 20 | ₹500 |
| 103 | Keyboard | 15 | ₹1,200 |
| 104 | Monitor | 8 | ₹12,000 |
| 105 | Headphones | 12 | ₹2,000 |

## Future Improvements

- Add functionality to update product details.
- Implement product deletion.
- Add low-stock alerts when product quantity is low.
- Implement file handling to save inventory data permanently.
- Add database connectivity using MySQL.
- Develop a graphical user interface using Java Swing or JavaFX.

## Limitations

- Product information is stored in memory using ArrayList.
- Data is lost when the application is closed.
- Duplicate Product IDs are not automatically checked.
- The application does not currently support updating or deleting products.

## Author

**Harshit Kumar**

## License

This project is created for educational and academic purposes.
