package main.java.oops.Cloud_Storage_Billing_And_File_Management;

import java.util.*;
import java.util.stream.Collectors;
public class StorageService {
    private Map<String, StorageItem> storageItems;

    public StorageService() {
        this.storageItems = new HashMap<>();
    }

    public void uploadFile(StorageItem item) {
        storageItems.put(item.getFileId(), item);
    }

    public List<StorageItem> getActiveFiles() {
        return storageItems.values().stream()
                .filter(StorageItem::isAvailable)
                .collect(Collectors.toList());
    }

    // cumualtive sum of Storage cost 
    public double getTotalActiveStorageCost() {
        return storageItems.values().stream()
                .filter(StorageItem::isAvailable)
                .mapToDouble(StorageItem::calculateStorageCost)
                .sum();
    }

    public StorageItem findMostExpensiveFile() {
        return storageItems.values().stream()
                .filter(StorageItem::isAvailable)
                .max(Comparator.comparingDouble(StorageItem::calculateStorageCost))
                .orElseThrow(() -> new FileNotFoundInStorageException("No active file found"));
    }

    public void archiveFile(String fileId) {
        StorageItem item = storageItems.get(fileId);
        if (item != null && item.isAvailable()) {
            item.Archive();
        } else {
            throw new FileNotFoundInStorageException("File not found or already archived");
        }
    }

    public long getCountOfActiveFiles(Class<? extends StorageItem> fileType) {
        return storageItems.values().stream()
                .filter(StorageItem::isAvailable)
                .filter(fileType::isInstance)
                .count();
    }

    public <T extends StorageItem> List<T> getActiveFilesByType(Class<T> type) {
        return storageItems.values().stream()
                .filter(StorageItem::isAvailable)
                .filter(type::isInstance)
                .map(type::cast)
                .collect(Collectors.toList());
    }

    public int getTotalFiles() {
        return storageItems.size();
    }

    public Map<String, StorageItem> getAllFiles() {
        //return new HashMap<>(storageItems);
        return Collections.unmodifiableMap(storageItems);
    }
}
