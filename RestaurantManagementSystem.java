package restaurant;

import java.util.Scanner;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        restaurant restaurant = new restaurant(new NormalBilling());
        
        restaurant.addToMenu(new Dish("Biryani-Single",230.0)); 
        restaurant.addToMenu(new Dish("Biryani-Full",500.0));
        restaurant.addToMenu(new Dish("Roti-3 with panner",350.0)); 
        restaurant.addToMenu(new Drink("Thumsup",50.0, false));
        restaurant.addToMenu(new Drink("Sprite",50.0, false)); 
        restaurant.addToMenu(new Drink("Wine",200.0, true)); 


        restaurant.getMenu().displayMenu();

        Order order = new Order();
        while (true) {
            System.out.print("Enter the item number to add to your order (or 0 to finish): ");
            int itemNumber = scanner.nextInt();

            if (itemNumber == 0) {
                break;
            }

            if (itemNumber > 0 && itemNumber <= restaurant.getMenu().getItems().size()) {
                Dish orderedDish = restaurant.getMenu().getItems().get(itemNumber - 1);
                order.addDish(orderedDish);
                System.out.println(orderedDish.getName() + " added to your order.");
            } else {
                System.out.println("Invalid item number. Please try again.");
            }
        }

        order.displayOrder();

        double bill = restaurant.calculateBill(order);
        System.out.println("Total Bill: ₹" + bill);

        System.out.println("With Discounts.....");
        restaurant = new restaurant(new Discounts());

        double d = restaurant.calculateBill(order);
        System.out.println("Total Bill during Happy Hour: ₹" + d);

        scanner.close();
    }
}

