public class exMet1 {
    public static void main(String[] args) {
        int i = ma(1, 1);
        float f = mb(Math.exp(5));
        String s = mc(2f, 8d);
        IseStudent1 l = md("John", "K","Maddy");
        for(double d=1; d<=256; d*=2)
            me(d);
    }
    //anwser
    public static int ma(int a, int b){
        return 0;
    }
    public  static  float mb(double ex ){
        return 0;
    }
    public  static  String mc(float c, double d){
        return "0";
    }
    public  static IseStudent1 md(String c, String g, String i){
        return new IseStudent1();
    }
    public  static  void me( double d){
        System.out.print(d);
    }
}
