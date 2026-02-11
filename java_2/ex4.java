import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("กรุณาป้อนอักษร 1 ตัว: ");
        char ch = scanner.next().charAt(0);

        System.out.println("ตัวอักษรที่คุณเลือก: "+ch);
    }
}
