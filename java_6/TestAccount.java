import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input code: ");
        String code = keyboard.next();
        System.out.print("Input name: ");
        String name = keyboard.next();
        System.out.print("Input balaence: ");
        double balaence = keyboard.nextDouble();
        Account pantip = new Account(code, name, balaence);
        pantip.show();

        //ฝากเงิน 1000 และแสดงผล
        double money = keyboard.nextDouble();
        pantip. deposit(money);
        pantip.show();


        //ถอน 900 และแสดงผล
        pantip.withdraw(money);
        pantip.show();
    }
}
