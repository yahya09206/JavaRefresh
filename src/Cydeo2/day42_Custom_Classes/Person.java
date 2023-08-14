package Cydeo2.day42_Custom_Classes;

public class Person {

    String name;
    int age;
    double height;
    boolean isMarried;

    Person(String name, int age, double height, boolean isMarried){
        this.name = name;
        this.age = age;
        this.height = height;
        this.isMarried = isMarried;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Jake The Snake", 32, 128, true);

        System.out.println(person1.name);

    }
}
