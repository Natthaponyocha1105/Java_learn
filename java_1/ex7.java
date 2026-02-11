import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("คะแนนเต็ม: ");
        double fullscore = scanner.nextDouble();

        System.out.println("กรุณากรอกคะแนนที่ได้: ");
        double myscore = scanner.nextDouble();

        double calculate = (myscore / fullscore)*100;

        System.out.printf("คุณได้คะแนน %.2f%%\n",calculate);
    }
}
