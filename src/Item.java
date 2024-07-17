public class Item {
    private double unitPrice;
    private String name;

    public Item(double unitPrice, String name) {
        this.unitPrice = unitPrice;
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getName() {
        return name;
    }
}
