public class PaytmAdapter implements PaymentGateWay {
    private Paytm paytm;

    public PaytmAdapter() {
        this.paytm = new Paytm();
    }

    @Override
    public void sendMoney(Double amount) {
        paytm.transferMoney(amount);
    }
    
}
