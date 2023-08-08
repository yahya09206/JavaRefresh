package Cydeo2.day46_Static;

public class AccessInPackage {
    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
        //System.out.println(obj.c);

        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
        //System.out.println(AccessModifier.z);

        // access all the information

    }
}
