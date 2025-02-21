package restaurant;


public class Discounts implements Billing {
    @Override
    public double getFinalPrice(double rawPrice) {
        return rawPrice * 0.8; // 20% discount
    }
}
