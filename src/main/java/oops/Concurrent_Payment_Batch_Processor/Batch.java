package main.java.oops.Concurrent_Payment_Batch_Processor;

import java.util.*;

/**
 * 
 * A Batch of Payment Transactions 
 * 
 */
public class Batch<T> {
    private final List<T> transactions;

    public Batch(List<T> transactions) {
        this.transactions = transactions;
    }
    
    public List<T> getTransactions() {
        return transactions;
    }

    public int size() {
        return transactions.size();
    }

    public List<List<T>> getChunks(int chunkSize) {
        if (chunkSize <= 0) {
            throw new IllegalArgumentException("Chunk size must be greater than 0");
        }

        int totalChunks = (int) Math.ceil((double) transactions.size() / chunkSize);
        List<List<T>> chunks = new ArrayList<>(totalChunks);

        for (int i = 0; i < transactions.size(); i += chunkSize) {
            int end = Math.min(transactions.size(), i + chunkSize);
            chunks.add(transactions.subList(i, end));
        }

        return chunks;
    }

}
