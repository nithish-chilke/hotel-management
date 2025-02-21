package restaurant;


import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Dish> orderedItems;

    public Order() {
        orderedItems = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        orderedItems.add(dish);
    }

    public List<Dish> getOrderedItems() {
        return orderedItems;
    }

    public void displayOrder() {
        System.out.println("---- Your Order ----");
        for (Dish dish : orderedItems) {
            System.out.println(dish.getName() + " - ₹" + dish.getPrice());
        }
    }
}
