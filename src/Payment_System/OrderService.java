package ATM;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService=paymentService;
    }
    public void processOrder(){
        paymentService.pay();
    }
}
