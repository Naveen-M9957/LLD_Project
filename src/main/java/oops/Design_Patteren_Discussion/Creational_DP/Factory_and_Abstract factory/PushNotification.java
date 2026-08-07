public class PushNotification implements Notification {
    @Override
    public void send(String msg) {
        System.out.println("Push notification sent with message: " + msg);
    }
}
