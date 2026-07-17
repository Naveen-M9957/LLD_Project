package main.java.oops.Inventroy_mgmt_Ecommerece;

public class Order {
    private String orderId;
    private boolean isExpressDelivery;  

    public Order(String orderId, boolean isExpressDelivery) {
        this.orderId = orderId;
        this.isExpressDelivery = isExpressDelivery;
    }

    public String getOrderId() {
        return orderId;
    }

    public boolean isExpressDelivery() {
        return isExpressDelivery;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", isExpressDelivery=" + isExpressDelivery + "]";
    }
}
