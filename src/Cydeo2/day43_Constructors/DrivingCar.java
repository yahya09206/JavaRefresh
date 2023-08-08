package Cydeo2.day43_Constructors;

public class DrivingCar {
    public static void main(String[] args) {

        Car audi = new Car();
        System.out.println(audi);
        audi.model = "S8";
        audi.color = "Black";
        audi.year = 2023;
        audi.fuelLevel = 80;

        System.out.println();
        System.out.println(audi);

        System.out.println();
        audi.drive();
        audi.drive();
        System.out.println(audi.fuelLevel);

        System.out.println();
        audi.fillTank();
        System.out.println(audi.fuelLevel);
    }
}
