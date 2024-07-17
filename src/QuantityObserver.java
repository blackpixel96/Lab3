public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        order.setShippingCost(order.getCount() <= 5);
    }
}
