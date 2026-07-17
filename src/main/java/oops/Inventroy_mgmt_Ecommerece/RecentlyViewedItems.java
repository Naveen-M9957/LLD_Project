package main.java.oops.Inventroy_mgmt_Ecommerece;
import java.util.ArrayList;
import java.util.List;

public class RecentlyViewedItems {
    private List<Item> recentlyViewedItems;
    private static final int MAX_RECENTLY_VIEWED_ITEMS = 10;

    public RecentlyViewedItems() {
        this.recentlyViewedItems = new ArrayList<>();
    }

    public void addRecentlyViewedItem(Item item) {
        if(item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        
        if (recentlyViewedItems.size() >= MAX_RECENTLY_VIEWED_ITEMS) {
            recentlyViewedItems.remove(0); // Remove the oldest item
        }
        recentlyViewedItems.add(item);
    }

    public List<Item> getRecentlyViewedItems() {
        return new ArrayList<>(recentlyViewedItems);
    }

    public void clearRecentlyViewedItems() {
        recentlyViewedItems.clear();
    }
}   
