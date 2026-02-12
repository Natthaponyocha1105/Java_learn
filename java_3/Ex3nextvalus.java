import java.util.ArrayList;

public class Ex3nextvalus {
   /*
    private  String name;
    private String gander;
    private  int  age;

    public Ex3nextvalus(String name, String gander, int age){
        this.name = name;
        this.gander = gander;
        this.age = age;
    }
    public static Ex3nextvalus humen(String name, String gender, int age) {
        Ex3nextvalus h = new Ex3nextvalus(name, gender, age);
        return h;
    }
    public  static  void main(String[]args){
        Ex3nextvalus people = humen("folk","male",20);
        System.out.println("who are you :"+people.name+"\nGender: "+people.gander+"\nage: "+people.age);
    }
    */

    public static void main(String[] args) {
        System.out.printf("NextValue(A) = %s %n", nextValue('A'));
        System.out.printf("NextValue(z) = %s %n", nextValue('z'));
        System.out.printf("NextValue(Z) = %s %n", nextValue('Z'));
        System.out.printf("NextValue(M) = %s %n", nextValue('M'));

    }
    public static int nextValue(int x){
        return x+1;
    }
    public static char nextValue(String s) {
        char ch = (char) (s.charAt(0)+1);
        return ch;
    }
    public static float nextValue(float x){
        return  x+1;
    }
    public static double nextValue(double x){
        return x+1;
    }
    public static ArrayList<Double> nextValue(int x, float y, double z){
        ArrayList<Double> num = new ArrayList<Double>();
        num.add(x+1.0);
        num.add(y+1.0);
        num.add(z+1);
        return num;
    }
    public static char nextValue(char ch){
        return (char)(ch + 1);
    }
    public static String nextValue(String input){
        if(input  == null){
            return null;
        }
        if(input.length()==0){
            return input;
        }
        if(input.length()==1){
            char c = input.charAt(0);
            return String.valueOf((char)(c + 1));
        }else{

        }

    }
}

