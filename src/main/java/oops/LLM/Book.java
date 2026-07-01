

public abstract class Book implements InnerLendable {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; // Initially, the book is available
    }

    public Book(Book obj) {
        this.title = obj.title;
        this.author = obj.author;
        this.isbn = obj.isbn;
        this.isAvailable = obj.isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean lend(User user) {
        if (isAvailable && user.canBarrowBooks()) {
            isAvailable = false; // Mark the book as lent
            System.out.println("Book '" + title + "' has been lent to " + user.getName());
            return true;
        } else {
            System.out.println("Book '" + title + "' is currently not available for lending.");
            return false;
        }
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true; // Mark the book as available again
        System.out.println("Book '" + title + "' has been returned by " + user.getName());
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public abstract void displayBookDetails();
}