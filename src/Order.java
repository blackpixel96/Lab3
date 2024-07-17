import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {

    private List<Item> items;
    private List<OrderObserver> observers;
    private double totalPrice;
    private boolean shippingCost;
    private boolean discountApplied;
    private String orderId;

    public Order() {
        items = new ArrayList<>();
        observers = new ArrayList<>();
        totalPrice = 0;
        shippingCost = true;
        discountApplied = false;
        orderId = UUID.randomUUID().toString();
    }

    public boolean isShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(boolean shippingCost) {
        this.shippingCost = shippingCost;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public void setDiscountApplied(boolean discountApplied) {
        this.discountApplied = discountApplied;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public int getCount() {
        return items.size();
    }

    public double getTotalPrice() {
        return totalPrice + (isShippingCost() ? 10:0) - (isDiscountApplied() ? 20:0);
    }

    public void addItem(Item item) {
        items.add(item);
        totalPrice += item.getUnitPrice();
        observers.forEach(observer -> observer.update(this));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("This order contains : \n");
        for (Item item : items) {
            stringBuilder.append(item.getName()).append(", $").append(item.getUnitPrice()).append("\n");
        }
        return stringBuilder.toString();
    }
}