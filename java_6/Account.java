public class Account {
    private String code;
    private String name;
    private double balaence;

    //constructor method เมธอดถุกเรียกใช้เมื่อ instance Object
    public Account(String code, String name, double balaence) {
        this.code = code;
        this.name = name;
        this.balaence = balaence;

    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getBalaence() {
        return balaence;
    }

    //เมธอดฝากเงิน (deposit) เงินที่นำมาฝากต้องมีค่ามากกว่า 0
    public void deposit(double money) {
        if (money > 0) {
            this.balaence += money;
        }
    }

    //เมธอดถอดเงิน (withdraw) เงินคงเหลือต้องมีค่ามากกว่าเท่ากับเงินที่่ถอด
    public void withdraw(double money) {
        if (balaence >= money) {
            balaence -= money;
        }
    }

    public void show() {
        System.out.printf("Code : %s%n", code);
        System.out.printf("Name : %s%n", name);
        System.out.printf("Balaence : %s%n"+"bath", balaence);




    }
}

