package ATM;

public class creditCardPayment extends Payment implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Paying with credit card");
    }
    public void validateCard(){
        System.out.println("Validating card");
    }

    @Override
    public void render() {

        validateCard();
    }
}




