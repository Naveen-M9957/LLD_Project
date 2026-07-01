package main.java.oops.LLM;

/**
 * Member
 */
public class Member extends User {
    private String membershipType;
    private int borrowedBooksCount;
    private static final int MAX_BARROW_LIMIT = 5;
    
    public Member(String name, String contactInfo, String membershipType) {
        super(name, contactInfo);
        this.membershipType = membershipType;
        this.borrowedBooksCount = 0;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public void incrementBorrowedBooksCount() {
        borrowedBooksCount++;
    }

    public void decrementBorrowedBooksCount() {
        borrowedBooksCount--;
    }

    @Override
    public void displayDashBoard() {
        System.out.println("Member Dashboard:");
        System.out.println("User ID: " + getUserId());
        System.out.println("Name: " + getName());
        System.out.println("Contact Info: " + getContactInfo());
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Borrowed Books Count: " + borrowedBooksCount);
    }

    @Override
    public boolean canBarrowBooks() {
        // Logic to determine if the member can borrow books based on their membership type and borrowed books count
        if (borrowedBooksCount < MAX_BARROW_LIMIT) {
            System.out.println(getName() + " can borrow more books.");
        } else {
            System.out.println(getName() + " has reached the borrowing limit.");
        }
    }
}