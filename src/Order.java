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
    }


    public void addItem(Item item) {

    }


}