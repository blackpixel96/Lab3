public class PriceObserver implements OrderObserver{
    @Override
    public void update(Order order) {
        order.setDiscountApplied(order.getTotalPrice() > 200);
    }
}
