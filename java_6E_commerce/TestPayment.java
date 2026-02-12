public class TestPayment {
    public static void main(String[] args){

        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new BankTransferPayment();

        payment1.pay(500);
        payment2.pay(1000);
    }

}
