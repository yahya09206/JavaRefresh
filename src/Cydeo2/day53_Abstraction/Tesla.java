package Cydeo2.day53_Abstraction;

public class Tesla extends ElectricCar {

    @Override
    public void start(){
        System.out.println("Car is starting");
    }

    @Override
    public void charge(){
        System.out.println("Car is charging");
    }
}
