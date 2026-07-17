package main.java.oops.Inventroy_mgmt_Ecommerece;
import java.util.*;

public class OrderProcessor {
    private PriorityQueue<Order> orderQueue;
            
    public OrderProcessor() {
        orderQueue = new PriorityQueue<>(
            Comparator.comparing(Order::isExpressDelivery)
            .reversed()
            .thenComparing(Order::getOrderId));
    }
    
    public void addOrder(Order order) {
        orderQueue.add(order);
    }

    public Order processNextOrder() {
        return orderQueue.poll();
    }

    public boolean hasOrders() {
        return !orderQueue.isEmpty();
    }
}
