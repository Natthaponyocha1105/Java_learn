import javax.swing.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args){
        Set<String> fruits = new HashSet<>();
        Set<String> fruits2 = new HashSet<>();


        //เพิ่มข้อมูล
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits2.add("lyches");
        fruits2.add("Papaya");
        fruits2.add("Orange");
       // addSetString(fruits, 2);

        //ลบข้อมูล
       // removeSetString(fruits);

        //รวมเซต (Union)
        Set<String> unions = new HashSet<>(fruits);
        unions.addAll(fruits2);

        //intersection (นำสิ่งที่เหมือนกัน(ซ้ำกัน)ของทั้ง 2 เซตมา)
        Set<String> intersec = new HashSet<>(fruits);
        intersec.retainAll(fruits2);

        //Difference (set หลัก มีสมาชิกที่แตกต่างจาก Set รอง อะไรบ้าง)
        Set<String> differ = new HashSet<>(fruits);
        differ.removeAll(fruits2);

        //Symmetric Difference
        Set<String> symmetricDiff = new HashSet<>(unions);
        symmetricDiff.removeAll(intersec);

        //แสดงผล
        show(fruits, "fruits set");
        show(fruits2, "fruits2 set" );
        show(unions, "unions set");
        show(intersec, "intersec set");
        show(differ, "differ set");
        show(symmetricDiff, "Symmetric Difference");
    }
    private static void show(Set<String> names, String title){
        String msg = "";
        for(String str : names){
            msg = msg + (str+"\n");
        }
        JOptionPane.showMessageDialog(null,msg,title,1);
    }
    private static void addSetString(Set<String> strings, int num){
        //รับคำ ทางคีบอร์ด
        for(int i = 0; i < num; i++){

            String str = JOptionPane.showInputDialog("Input favorite fruit: ");
            strings.add(str);


        }
    }
    private static void removeSetString(Set<String> strings){
        String data =JOptionPane.showInputDialog(strings);
        strings.remove(data);

    }
}

