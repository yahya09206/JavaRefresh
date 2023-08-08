package Cydeo2.day53_Abstraction;

public class Garage {
    public static void main(String[] args) {

        Toyota obj2 = new Toyota();
        obj2.start();

        System.out.println();

        Honda obj3 = new Honda();
        obj3.start();

        System.out.println();

        Tesla obj4 = new Tesla();
        obj4.start();
        obj4.charge();


    }
}
