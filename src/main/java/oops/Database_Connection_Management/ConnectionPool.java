package main.java.oops.Database_Connection_Management;

public interface ConnectionPool {
    void initializePool();

    DatabaseConnection getConnection();

    void releaseConnection(DatabaseConnection connection);

    int getAvailableConnectionsCount();
    
    int getTotalConnectionsCount();
}
