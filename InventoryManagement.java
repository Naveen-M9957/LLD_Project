package main.java.oops.Inventroy_mgmt_Ecommerece;
import java.util.*;

public class InventoryManagement <T extends Item> {
    private Map<String, T> inventory;

    public InventoryManagement() {
        inventory = new HashMap<>();
    }

    public void addItem(T item) {
        if(item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        if(inventory.containsKey(item.getId())) {
            throw new IllegalArgumentException("Item with ID " + item.getId() + " already exists.");
        }
        inventory.put(item.getId(), item);
    }

    public void removeItem(String id) {
        if(!inventory.containsKey(id)) {
            throw new IllegalArgumentException("Item with ID " + id + " does not exist.");
        }
        inventory.remove(id);
    }

    public T getItem(String id) {
        T item = inventory.get(id);
        if(item == null) {
            throw new IllegalArgumentException("Item with ID " + id + " does not exist.");
        }
        return item;
    }

    public Collection<T> getAllItems() {
        return new ArrayList<>(inventory.values());
    }
    
    public boolean itemExists(String id) {
        return inventory.containsKey(id);
    }

    public List<T> getSortedItemsByPrice() {
        List<T> itemList = new ArrayList<>(inventory.values());
        //sort items by price using Comparator
        itemList.sort(Comparator.comparingDouble(Item::getPrice));
        return itemList;

        /* 
        * stream API clean approch
        * return inventory.values()
        *        .stream()
        *        .sorted(Comparator.comparingDouble(Item::getPrice))
        *        .toList();
        */
    }

    public List<T> getSortedItemsByName() {
        List<T> itemList = new ArrayList<>(inventory.values());
        //sort items by name using Comparator
        itemList.sort(Comparator.comparing(Item::getName));
        return itemList;
    }

    public List<T> getSortedItemsByQuantity() {
        List<T> itemList = new ArrayList<>(inventory.values());
        //sort items by quantity using Comparator
        itemList.sort(Comparator.comparingInt(Item::getQuantity).reversed());
        return itemList;
    }

    public List<T> filterItemsByPriceRange(double minPrice, double maxPrice) {
        if (minPrice > maxPrice) {
            throw new IllegalArgumentException("Minimum price cannot be greater than maximum price.");
        }
        List<T> filteredItems = new ArrayList<>();
        for (T item : inventory.values()) {
            //check if the item price is within the specified range
            if (item.getPrice() >= minPrice && item.getPrice() <= maxPrice) {
                //add the item to the filtered list
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }

    public List<T> getAvailableItems() {
        List<T> availableItems = new ArrayList<>();
        for (T item : inventory.values()) {
            //check if the item quantity is greater than 0
            if (item.getQuantity() > 0) {
                //add the item to the available items list
                availableItems.add(item);
            }
        }
        return availableItems;
    }

}
