public class GpayAdapter implements PaymentGateWay {
    private Gpay gpay;

    public GpayAdapter() {
        this.gpay = new Gpay();
    }

    @Override
    public void sendMoney(Double amount) {
        gpay.sendMoney(amount);
    }
}
