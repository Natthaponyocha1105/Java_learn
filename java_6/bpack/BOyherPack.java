package bpack;
import apack.A;
public class BOyherPack {
    public static void main(String[] args) {
        A as = new A();
        //as.print(); error เพราะ print() modifier as default
       // as.defaultAttribute = 70; error on access
       // as.protectedAttribute =90; error no access
        as.publicAttribute = 100;
        // as.privateAttribute = 25; error private no access
        System.out.println(as.publicAttribute);
    }
}
