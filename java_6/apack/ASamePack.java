package apack;

public class ASamePack {
    public static void main(String[] args) {
        A as = new A();
        as.print();
        as.defaultAttribute = 70;
        as.protectedAttribute =90;
        as.publicAttribute = 100;
       // as.privateAttribute = 25; error private no access
        as.print();
    }
}
