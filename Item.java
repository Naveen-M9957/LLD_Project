package main.java.oops.Inventroy_mgmt_Ecommerece;

public class Item implements Comparable<Item> {
    private String id;
    private String name;
    private double price;
    private int quantity; 

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public int compareTo(Item other) {
        //compare based on price
        //return Double.compare(this.price, other.price);

        //compare based on name
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }
}
