import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArraylistExample {
    public static void main(String[] args){
        //สร้างลิสต์
        ArrayList<String> fruits = new ArrayList<>();
        List<Object> scores = new ArrayList<>();
        List<Object> incomes = new LinkedList<Object>(List.of(1200.0, 5500.0,3500.0));

        //เพิ่มข้อมูล
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        scores.add(50.0);
        scores.add(45.5);
        scores.add(55.3);
        calAverage(scores);
        calAverage(incomes);
        addListString(fruits,2);

        //แก้ไขข้อมูล
        scores.set(1, 49.5);

        //จัดเรียงข้อมูล
        Collections.sort(fruits);
        List<Double> numbers = new ArrayList<Double>(List.of(7.0,8.5,2.5,10.5));
        double numMax = Collections.max(numbers);
        double numMin = Collections.min(numbers);

        //แสดงผล
        System.out.println(fruits);
        System.out.println(scores);
        System.out.println("รายได้พนักงาน คนที่ 2 "+incomes.get(1));
        System.out.println("รายได้พนักงาน คนที่ 1 "+incomes.getFirst());
        System.out.println("รายได้พนักงาน คนที 3 "+incomes.getLast());
        System.out.println(numbers+"ค่าสูงสุด คือ "+numMax);
        System.out.println(numbers+"ค่าต่ำสุด คือ "+numMin);

    }
    //main
    private static void calAverage(List<Object> numbers){
        double sum = 0, avg =0;
        for (Object num : numbers){
            sum = sum + (double) num;
        }
        avg = sum/numbers.size();
        System.out.println("Average of List is "+ avg);
    }
    private static void addListString(List<String> strings, int num){
        //รับคำ ทางคีบอร์ด
        for(int i = 0; i < num; i++){

            String str = JOptionPane.showInputDialog("Input fruit favorite");
            strings.add(str);


        }
    }
}
