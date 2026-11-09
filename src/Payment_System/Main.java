package Payment_System;

public class Main {
    public static void main(String[] args){
        var p1=new CreditCardPayment();
        var p2=new PaypalPayment();
        Process(p1);
        System.out.println("");
        Process(p2);
        var p3= new Payment();
        Process(p3);
        System.out.println("");
        p1.render();
        System.out.println("");
        p2.render();
        var p4 =new CryptoPayment();
        Process(p4);
        System.out.println("=============================================");
        var  test=new CryptoPayment();
        var ord= new OrderService(test);
        ord.processOrder();

    }
    public static void Process(Payment payment){
//        payment.pay();
       payment.render();
//        if (payment instanceof creditCardPayment)
//            ((creditCardPayment) payment).validateCard();
//
//        if (payment instanceof paypalPayment)
//            ((paypalPayment) payment).sendReceipt();


    }

}
