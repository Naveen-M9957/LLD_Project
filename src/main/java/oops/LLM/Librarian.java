package main.java.oops.LLM;

/**
 * Librarian
 */
public class Librarian extends User {
    private String employeeNumber;

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashBoard() {
        System.out.println("Librarian Dashboard:");
        System.out.println("User ID: " + getUserId());
        System.out.println("Name: " + getName());
        System.out.println("Contact Info: " + getContactInfo());
        System.out.println("Employee Number: " + employeeNumber);
    }

    @Override
    public boolean canBarrowBooks() {
        // Logic to determine if the librarian can borrow books (if applicable)
        System.out.println(getName() + " is a librarian and cannot borrow books.");
        return true; // Librarians typically do not borrow books
    }

    public void addNewBook(Book book)  { /* HW: implementation later */ }
    public void removeBook(Book book)  { /* HW: implementation later */ }

}