package main.java.oops.LLM;

/**
 * InnerLendable
 */
public interface InnerLendable {
    boolean lend(User user);
    void returnBook(user user);
    boolean isAvailable();
}
