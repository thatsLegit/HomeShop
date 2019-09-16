package homeshop;

public class Fridge extends Product {
    Integer liter;
    boolean freezer;

    public Fridge(String name, String description, double price, Integer liter, boolean freezer) {
        super(name, description, price);
        this.liter = liter;
        this.freezer = freezer;
    }

    public boolean isfreezer() {
        return freezer;
    }

    public int getliter() {
        return liter;
    }
}
