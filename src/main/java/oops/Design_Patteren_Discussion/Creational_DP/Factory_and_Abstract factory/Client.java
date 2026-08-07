public class Client {
    public static void main(String[] args) {
        Notification pushNotification = NotificationFactory.create("push");
        pushNotification.send("Hello via Push!");

        Notification smsNotification = NotificationFactory.create("sms");
        smsNotification.send("Hello via SMS!");

        Notification emailNotification = NotificationFactory.create("email");
        emailNotification.send("Hello via Email!");
    }
}
