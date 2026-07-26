package main.java.oops.Concurrent_Payment_Batch_Processor;

/**
 * 
 * A Single Payment Transaction
 * 
 *  This is Immutable class. Once a transaction is created, it cannot be modified.
 * 
 */
public final class Transaction {
   private static int idCounter = 0;
   private final String transactionId;
   private final double amount;
   private final TransactionStatus status;

   public Transaction(double amount, TransactionStatus status) {
      this.transactionId = "T-" + (++idCounter);
      this.amount = amount;
      this.status = TransactionStatus.PENDING;
   }

   private Transaction(String transactionId, double amount, TransactionStatus status) {
      this.transactionId = transactionId;
      this.amount = amount;
      this.status = status;
   }

   public Transaction settle() {
      return new Transaction(this.transactionId, this.amount, TransactionStatus.SETTLED);
   }

   public String getTransactionId() {
      return transactionId;
   }

   public double getAmount() {
      return amount;
   }

   public TransactionStatus getStatus() {
      return status;
   }

   @Override
   public String toString() {
      return "Transaction{" +
              "transactionId='" + transactionId + '\'' +
              ", amount=" + amount +
              ", status=" + status +
              '}';  
   }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        return this.transactionId.equals(that.transactionId);
    }
    
    @Override
    public int hashCode() {
        return transactionId.hashCode();
    }
    
}   
