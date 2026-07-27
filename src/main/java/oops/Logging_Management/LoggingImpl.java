package main.java.oops.Logging_Management;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;

public class LoggingImpl implements Logger {
    private String logFilePath;
    private static LoggingImpl instance;
    private PrintWriter logWriter;
    private LoggingImpl() {
        // Private constructor to prevent instantiation
    }
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (LoggingImpl.class) {
                if (instance == null) {
                    instance = new LoggingImpl();
                }
            }
        }
        return instance;
    }

    public void resetInstance() {
        synchronized (LoggingImpl.class) {
            if (instance != null) {
                instance.close(); // Close the log writer if it exists
                instance = null; // Reset the instance to null
            }
        }
    }

    @Override
    public void log(String message, int level) {
        String TS = java.time.LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        if (logWriter != null) {
            logWriter.println("[" + TS + "] [" + level + "] " + message);
            logWriter.flush(); // Ensure the message is written to the file immediately
        } else {
            throw new IllegalStateException("Log file is not set. Please set the log file before logging.");
        }
    }

    @Override
    public void setLogFile(String filePath) {        
        try {
            if(logWriter != null) {
                logWriter.close(); // Close the previous log writer if it exists
            }
            this.logFilePath = filePath;
            this.logWriter = new PrintWriter(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getLogFile() {
        if(logFilePath == null) {
            throw new IllegalStateException("Log file is not set. Please set the log file before getting the log file path.");
        }
        return logFilePath;
    }

    @Override
    public void flush() {
        if (logWriter != null) {
            logWriter.flush();
        } else {
            throw new IllegalStateException("Log file is not set. Please set the log file before flushing.");
        }
    }

    @Override
    public void close() {
        if (logWriter != null) {
            logWriter.close();
            logWriter = null; // Set to null after closing to avoid using a closed writer
            logFilePath = null; // Reset the log file path
        } else {
            throw new IllegalStateException("Log file is not set. Please set the log file before closing.");
        }
    }
}
