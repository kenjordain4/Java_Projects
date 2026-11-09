package ATM;

public class paypalPayment extends Payment implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Paying with Paypal");
    }
    public  void sendReceipt(){
        System.out.println("Sending receipt");
    }

    @Override
    public void render() {
        sendReceipt();
    }
}
