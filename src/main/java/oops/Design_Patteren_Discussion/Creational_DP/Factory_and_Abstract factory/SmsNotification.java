public class SmsNotification implements Notification {
    @Override
    public void send(String msg) {
        System.out.println("SMS notification sent with message: " + msg);
    }
}
