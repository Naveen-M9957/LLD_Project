package main.java.oops.Design_Patteren_Discussion.Creational_DP.Singleton_DP_Demo;

/**
 * A thread-safe singleton implementation using double-checked locking.
 */
public class Singleton {
    // Volatile variable to ensure visibility of changes across threads
    private static volatile Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        synchronized (Singleton.class) {
            if (instance != null) {
                instance = null; // Reset the instance to null
            }
        }
    }
    
}
