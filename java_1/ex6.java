import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        System.out.println("กรุณาใส่ชื่อ ");

        String x = name.next();

        System.out.println("กรุณาใส่อายุ");

        int y = age.nextInt();
        System.out.println("ชื่อ: "+x+" และอายุ :"+y+" ปี");
    }
}
