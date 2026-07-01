package main.java.oops.LLM;

/**
 * User
 */
public abstract class User {
    private final String userId;
    private String name;
    private String contactInfo;
    private static int idCounter;
    private static int totalUser;

    public User(){
        userId = generateUniqueId();
        totalUser++;
    }

    public User(String name, String contactInfo){
        userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
        totalUser++;
    }

    public User(User dc){
        userId = generateUniqueId();
        this.name = dc.name;
        this.contactInfo = dc.contactInfo;
        totalUser++;        
    }

    private static String generateUniqueId() {
        return "U_" + (++idCounter);
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public static int getTotalUser() {
        return totalUser;
    }


    public abstract void  displayDashBoard();
    public abstract boolean  canBarrowBooks();
}
