public class ex3_2 {
    public static void main(String[] args) {
        add(10, 11);
        add(50, 25);
        div(10, 2);
        div(100, 5);
        div(5, 10);
        mul(2.5, 10);
    }

    public static void add(int x, int y) {
        int sum = 0;
        sum = x + y;
        System.out.printf("%d + %d = %d %n", x, y, sum);
    }

    public static void div(int x, int y) {
        double output = (double) x / y;
        System.out.printf("%d / %d = %.2f %n", x, y, output);
    }

    public static void mul(double x, int y) {
        double output = (double) x * y;
        System.out.printf("%.2f * %d = %.2f %n", x, y, output);
    }
}
