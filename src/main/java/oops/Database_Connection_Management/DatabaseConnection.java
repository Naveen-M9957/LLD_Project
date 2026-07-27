package main.java.oops.Database_Connection_Management;

/**
 * DatabaseConnection
 */
public class DatabaseConnection {
    private boolean isConnected;

    public DatabaseConnection() {
        this.isConnected = false;
    }

    public void connect() {
        if (!isConnected) {
            // Simulate connecting to a database
            isConnected = true;
            System.out.println("Database connected.");
        } else {
            System.out.println("Already connected to the database.");
        }
    }

    public void disconnect() {
        if (isConnected) {
            // Simulate disconnecting from a database
            isConnected = false;
            System.out.println("Database disconnected.");
        } else {
            System.out.println("Already disconnected from the database.");
        }
    }

    public boolean isConnected() {
        return isConnected;
    }
}   
