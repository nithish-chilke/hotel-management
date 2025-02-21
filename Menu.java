package restaurant;


import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        items.add(dish);
    }

    public List<Dish> getItems() {
        return items;
    }

    public void displayMenu() {
        System.out.println("---- Menu ----");
        for (int i = 0; i < items.size(); i++) {
            Dish dish = items.get(i);
            System.out.println((i + 1) + ". " + dish.getName() + " - ₹" + dish.getPrice());
        }
    }
}
