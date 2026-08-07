public class NotificationFactory {
    public static Notification create(String type) {
        if ("SMS".equalsIgnoreCase(type)) {
            return new SmsNotification();
        } else if ("EMAIL".equalsIgnoreCase(type)) {
            return new EmailNotification();
        } else if ("PUSH".equalsIgnoreCase(type)) {
            return new PushNotification();
        }
        
        throw new IllegalArgumentException("Unknown notification type: " + type);
    }
}
