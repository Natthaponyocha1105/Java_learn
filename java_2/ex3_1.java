public class ex3_1 {
    public static void main(String[] args) {
        Singer one = new Singer();
        one.name = "วรรณภัทร";
        one.gender = false;

        one.chorus();
        System.out.println(one.chorus1());
        one.chorus2("I know our dreams will never die");
        String msg = "รู้ว่าความฝันของเรานั้น จะไม่มีวันสูญสลาย";
        System.out.println(one.chorus3(msg));

        Singer two = new Singer();
        two.name = "วาสนา";
        two.gender = true;
        System.out.println(two.chorus3(msg));
    }
}
