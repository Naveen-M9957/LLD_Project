package main.java.oops.LLM;


import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    List<Book> bookInventory = new ArrayList<>();
    List<User> registeredUsers = new ArrayList<>();
        
    public void addBooks(Book book){
        if(!bookInventory.contains(book))
            bookInventory.add(book);
    }
        
    public void registerUser(User user){
        if(!registeredUsers.contains(user))
            registeredUsers.add(user);
    }

    public void lendBook(Book book, User user){
        if(bookInventory.contains(book) && registeredUsers.contains(user)){
            book.lend(user);
        } else {
            System.out.println("Either the book is not in inventory or the user is not registered.");
        }
    }

    public void returnBook(Book book, User user){
        if(bookInventory.contains(book) && registeredUsers.contains(user)){
            book.returnBook(user);
        } else {
            System.out.println("Either the book is not in inventory or the user is not registered.");
        }
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books in the Library:");
        for (Book book : bookInventory) {
            if (book.isAvailable()) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
            }
        }
    }

    public void displayRegisteredUsers() {
        System.out.println("Registered Users in the Library:");
        for (User user : registeredUsers) {
            user.displayDashBoard();
        }
    }

    public void displayUserDashboard(User user) {
        if (registeredUsers.contains(user)) {
            user.displayDashBoard();
        } else {
            System.out.println("User is not registered in the library.");
        }
    }

    public void searchBookByTitle(String title) {
        System.out.println("Searching for books with title: " + title);
        for (Book book : bookInventory) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found Book - Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
            }
        }
    }

    public void searchBookByAuthor(String author) {
        System.out.println("Searching for books by author: " + author);
        for (Book book : bookInventory) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Found Book - Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
            }
        }
    }

    public void searchBookByISBN(String isbn) {
        System.out.println("Searching for book with ISBN: " + isbn);
        for (Book book : bookInventory) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                System.out.println("Found Book - Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
            }
        }
    }

    public void removeBook(Book book) {
        if (bookInventory.contains(book)) {
            bookInventory.remove(book);
            System.out.println("Book '" + book.getTitle() + "' has been removed from the inventory.");
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not found in the inventory.");
        }
    }

    public void removeUser(User user) {
        if (registeredUsers.contains(user)) {
            registeredUsers.remove(user);
            System.out.println("User '" + user.getName() + "' has been removed from the registered users.");
        } else {
            System.out.println("User '" + user.getName() + "' is not found in the registered users.");
        }
    }
}