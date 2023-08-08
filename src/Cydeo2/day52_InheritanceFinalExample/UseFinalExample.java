package Cydeo2.day52_InheritanceFinalExample;

public class UseFinalExample {
    public static void main(String[] args) {

        System.out.println(FinalExample.PLANET);

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.b);

        System.out.println();

        FinalExample obj2 = new FinalExample(100);
        System.out.println(obj2.b);

    }
}
