package main.java.oops.Database_Connection_Management;

public class ConnectionPoolImpl implements ConnectionPool {
    private static volatile ConnectionPoolImpl instance;
    private final int maxConnections;
    private final DatabaseConnection[] connections;
    private boolean[] connectionInUse;
    
    public static ConnectionPoolImpl getInstance(int maxConnections) {
        if (instance == null) {
            synchronized (ConnectionPoolImpl.class) {
                if (instance == null) {
                    instance = new ConnectionPoolImpl(maxConnections);
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        synchronized (ConnectionPoolImpl.class) {
            if (instance != null) {
                instance = null; // Reset the instance to null
            }
        }
    }

    public ConnectionPoolImpl(int maxConnections) {
        if(maxConnections <= 0) {
            throw new IllegalArgumentException("Maximum connections must be greater than zero.");
        }
        this.maxConnections = maxConnections;
        this.connections = new DatabaseConnection[maxConnections];
        this.connectionInUse = new boolean[maxConnections];
        initializePool();
    }

    @Override
    public void initializePool() {
        for (int i = 0; i < maxConnections; i++) {
            connections[i] = new DatabaseConnection();
            connectionInUse[i] = false;
        }
    }

    @Override
    public synchronized DatabaseConnection getConnection() {
        for (int i = 0; i < maxConnections; i++) {
            if (!connectionInUse[i]) {
                connectionInUse[i] = true;
                return connections[i];
            }
        }
        return null; // No available connections
    }

    @Override
    public synchronized void releaseConnection(DatabaseConnection connection) {
        for (int i = 0; i < maxConnections; i++) {
            if (connections[i] == connection) {
                connectionInUse[i] = false;
                break;
            }
        }
        throw new IllegalArgumentException("Connection does not belong to this pool");
    }

    @Override
    public int getAvailableConnectionsCount() {
        int count = 0;
        for (boolean inUse : connectionInUse) {
            if (!inUse) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int getTotalConnectionsCount() {
        return maxConnections;
    }
    
}
