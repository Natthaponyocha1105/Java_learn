public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("จ่ายผ่านบัตรเครดิต จํานวน: " + amount + " บาท");
    }
}