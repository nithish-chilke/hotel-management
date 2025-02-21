package restaurant;


import java.util.ArrayList;
import java.util.List;

public class restaurant {
    private Menu menu;
    private List<Order> orders;
    private Billing billingStrategy;

    public restaurant(Billing billingStrategy) {
        menu = new Menu();
        orders = new ArrayList<>();
        this.billingStrategy = billingStrategy;
    }

    public void addToMenu(Dish dish) {
        menu.addDish(dish);
    }

    public Menu getMenu() {
        return menu;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public double calculateBill(Order order) {
        double total = 0.0;
        for (Dish dish : order.getOrderedItems()) {
            total += billingStrategy.getFinalPrice(dish.getPrice());
        }
        return total;
    }
}
