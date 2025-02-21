package restaurant;


public class NormalBilling implements Billing{
    @Override
    public double getFinalPrice(double rawPrice) {
        return rawPrice;
    }
}
