import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("คำนวณพื้นที่สามเหลี่ยมพื้นผ้า: ");
        System.out.print("ป้อนความกว้าง: ");
        double width = kb.nextDouble();
        System.out.print("ป้อนความยาว: ");
        double lenght = kb.nextDouble();
        double age = width*lenght;
        System.out.print("พื้นที่สามเหลียม =: "+age);
    }





    /*
    public static void main(String[] args) {
        double log = 10;
        double width = 6;

        System.out.println("กว้าง: "+log);
        System.out.println("ยาว: "+width);
        System.out.println("ตอบ: "+log * width);
    }
*/

}
