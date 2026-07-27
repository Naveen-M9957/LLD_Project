package main.java.oops.Logging_Management;

public interface Logger {
    void log(String message, int level);
    void setLogFile(String filePath);
    String getLogFile();
    void flush();
    void close();
}
