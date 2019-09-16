package homeshop;

public class Television extends Product {

    Integer size;
    String slabType;

    public Television(String name, String description, double price, Integer size, String slabType) {
        super(name, description, price);
        this.size = size;
        this.slabType = slabType;
    }

    public int getsize() {
        return size;
    }

    public String getslabType() {
        return slabType;
    }
}
