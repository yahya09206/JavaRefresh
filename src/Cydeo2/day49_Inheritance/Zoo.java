package Cydeo2.day49_Inheritance;

public class Zoo {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.species = "Generic Animal";
        animal.numberOfLegs = 0;
        animal.walk();

        System.out.println();

        Dog dog = new Dog();
        dog.species = "Dog";
        dog.numberOfLegs = 4;
        dog.walk();

        System.out.println();

        Lion lion = new Lion();
        lion.species = "Simba";
        lion.numberOfLegs = 4;
        lion.maneSize = 3;
        lion.walk();
        lion.roar();
    }
}
