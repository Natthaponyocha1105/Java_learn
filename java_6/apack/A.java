package apack;

public class A {
    int defaultAttribute=40;
    private int privateAttribute = 20;
    protected int protectedAttribute = 30;
    public int publicAttribute = 10;

    void print(){
        System.out.printf("drfaultAttribute = %d privateAttribute = %d%n",defaultAttribute,privateAttribute);
        System.out.printf("protectedAttribute = %d publicAttribute = %d%n",defaultAttribute,privateAttribute);

    }
}
