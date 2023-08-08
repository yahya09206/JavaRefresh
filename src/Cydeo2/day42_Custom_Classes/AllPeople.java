package Cydeo2.day42_Custom_Classes;

public class AllPeople {
    public static void main(String[] args) {

        // these are not valid ways to access instance variables
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(Person.name);
//        System.out.println(Persona.age);

        Person p1 = new Person();
        p1.name = "Johnny";
        p1.age = 25;
        p1.height = 173.3;
        p1.isMarried = false;
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.height);
        System.out.println(p1.isMarried);

        System.out.println();

        Person p2 = new Person();
        p2.name = "Mikhail";
        p2.age = 32;
        p2.height = 192.3;
        p2.isMarried = true;
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.height);
        System.out.println(p2.isMarried);
    }
}
