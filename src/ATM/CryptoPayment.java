package ATM;

public class cryptoPayment extends Payment implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Paying with crypto\n" +
                "Verifying blockchain");
    }

    @Override
    public void render() {
        pay();

    }
}
