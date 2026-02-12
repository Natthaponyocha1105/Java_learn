import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<Double> weight1 = new HashSet<>();
        Set<Double> weight2 = new HashSet<>();

        weight1.add(45.0);
        weight1.add(23.5);
        weight1.add(41.0);
        weight1.add(12.5);
        weight1.add(35.0);

        weight2.add(50.0);
        weight2.add(41.0);
        weight2.add(12.0);
        weight2.add(35.0);
        weight2.add(44.5);

        Set<Double> unions = new HashSet<>(weight1);
        unions.addAll(weight2);
        Set<Double> intersec = new HashSet<>(weight1);
        intersec.retainAll(weight2);
        Set<Double> differ = new HashSet<>(weight1);
        differ.removeAll(weight2);
        Set<Double> symmetricDiff = new HashSet<>(unions);
        symmetricDiff.removeAll(intersec);

        show(weight1, "Weight1");
        show(weight2, "Weight2");
        show(unions, "Unions Set");
        show(intersec, "intersec Set");
        show(differ , "defference Set");
        show(symmetricDiff, "Symmetric Different");
    }
    private static void show(Set<Double> names, String title){
        String msg = "";
        for(double str : names){
            msg = msg + (str+"\n");
        }
        JOptionPane.showMessageDialog(null,msg,title,1);
    }
}
