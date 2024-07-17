import java.util.List;

public class Client {
    private String name;
    private List<Order> orders;

    public Client(String name) {
        this.name = name;
    }

    void addItemToOder(Item item, Order order) {
        order.addItem(item);
    }

    String getName() {
        return name;
    }
}