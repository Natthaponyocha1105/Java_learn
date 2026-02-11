import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("กรุณาใส่อุณหภูมิ: ");
        double c = scanner.nextDouble();

        System.out.println("อุณหภูมิที่คุรใส่: ");

        double f = (c * 9/5) + 32;
        System.out.printf(c+" อุณหภูมิ" +f+" ฟาเรนไฮต์");
    }
}
