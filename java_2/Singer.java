public class Singer {
    String name;
    boolean gender;

    public void chorus(){
        System.out.println("If we hold on together");
    }
    public String chorus1(){
        String word = "ถ้าเราจับมือกันไว้ แล้วไปดเ้วยกัน";
        return word;
    }
    public  void chorus2(String word){
        System.out.println(word);
    }
    public  String chorus3(String word){
       String message = name + " "+ word;
        return message;
    }
}
