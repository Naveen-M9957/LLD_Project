package main.java.oops.Inventroy_mgmt_Ecommerece;

public class Clothing extends Item {
    private String size;

    public Clothing(String id, String name, double price, int quantity, String size) {
        super(id, name, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
    
}
