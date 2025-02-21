# Restaurant Management System

## Overview
The Restaurant Management System is a Java-based application designed to simulate the operations of a restaurant. The system allows users to interactively place orders from a menu, and then calculates and displays the total bill. The system also demonstrates object-oriented programming concepts such as classes, inheritance, encapsulation, and polymorphism.

## Features
- **Menu Display**: Displays a list of available dishes and drinks with their prices.
- **Order Placement**: Allows users to place an order by selecting items from the menu.
- **Bill Calculation**: Calculates the total bill in Indian Rupees (₹) based on the selected items.
- **Happy Hour Billing**: Demonstrates a Happy Hour billing strategy with a 20% discount.

## Concepts Used
- **Classes and Inheritance**: 
  - `Dish` class represents a menu item.
  - `Drink` class inherits from `Dish` and adds additional properties like whether the drink is alcoholic.
  
- **Encapsulation**: 
  - `Order` class encapsulates the details of an order.
  
- **Polymorphism**: 
  - `BillingStrategy` interface is used to apply different billing strategies, such as normal billing and Happy Hour billing.

## Project Structure
```plaintext
RestaurantManagementSystem/
├── Dish.java
├── Drink.java
├── Menu.java
├── Order.java
├── BillingStrategy.java
├── NormalBillingStrategy.java
├── HappyHourBillingStrategy.java
└── RestaurantManagementSystem.java

OUTPUT Of The CODE:
RestaurantManagementSystem 
---- Menu ----
1. Biryani-Single - ₹230.0
2. Biryani-Full - ₹500.0
3. Roti-3 with panner - ₹350.0
4. Thumsup - ₹50.0
5. Sprite - ₹50.0
6. Wine - ₹200.0
Enter the item number to add to your order (or 0 to finish): 1
Biryani-Single added to your order.
Enter the item number to add to your order (or 0 to finish): 4
Thumsup added to your order.
Enter the item number to add to your order (or 0 to finish): 0
---- Your Order ----
Biryani-Single - ₹230.0
Thumsup - ₹50.0
Total Bill: ₹280.0
With Discounts.....
Total Bill during Happy Hour: ₹224.0
