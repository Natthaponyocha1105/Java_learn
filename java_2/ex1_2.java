public class ex1_2 {
    public static void main(String[] args) {
        double x = 1, y = 2;
        byte by = -12; //เก็บค่าได้ไม่เกินนี้-128 - 127
        byte by1 = 2;
        System.out.println("-> "+(x/y));
        System.out.println(("1/2->"+(1/2)));
        System.out.println(("1+2->"+(1+2)));
        System.out.println(("1*2->"+(1*2.0)));
        System.out.println(("by * by1"+(by * by1)));
        System.out.println(("by * y"+(by * y)));

        System.out.println("การเปลี่ยนชนิดข้อมูล(Casting)เก็บจำนวนเต็ม"+(int)48.965);
        System.out.println("การเปลี่ยนชนิดข้อมูล(Casting)เก็บทศนิยม"+(double)25);
        System.out.println("การเปลี่ยนชนิดข้อมูล(Casting)เก็บตัวอักษร"+(char)97);
        System.out.println("การเปลี่ยนชนิดข้อมูล(Casting)เก็บจำนวนเต็ม"+(int)'6');
        System.out.println("การเปลี่ยนชนิดข้อมูล(Casting)เก็บข้อความ"+(String) String.valueOf('A'));
    }
}
