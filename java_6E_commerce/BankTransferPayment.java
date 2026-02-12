public class BankTransferPayment implements Payment {
    @Override
    public void pay(double amount){
        System.out.println("โอนผ่านธนาคาร จำนวน :"+amount + "บาท");
    }
}
