package restaurant;

public class Drink extends Dish {
    private boolean isAlcoholic;

    public Drink(String name, double price, boolean isAlcoholic) {
        super(name, price);
        this.isAlcoholic = isAlcoholic;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }
}
