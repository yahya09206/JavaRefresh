package MethodsPt2;

public class WrapperClassObject {
    public static void main(String[] args) {

        int a = 5;

        // What can we do with this: assign/reassign, math, casting
        // What can't we do with this: a.method()

        Integer a2 =  new Integer(10);
        Integer a3 = 20;

        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);

        byte b  = 2;
        Byte b2 = 10;
        System.out.println(b);
        System.out.println(b2);
    }
}
