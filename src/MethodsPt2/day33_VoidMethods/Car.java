package MethodsPt2.day33_VoidMethods;

public class Car {

    public static void unlockCar(){
        System.out.println("Unlocking the car");
    }

    public static void openDoor(){
        System.out.println("Opening the door");
    }

    public static void sitInCar(){
        System.out.println("Sitting in the car");
        System.out.println("Closing the door");
    }

    public static void getReadyToGo(){
        System.out.println("Putting on seatbelt");
        System.out.println("Check mirrors");
        System.out.println("Put on music");
        System.out.println("Put on navigation");
    }

    public static void startCar(){
        System.out.println("Starting car");
    }

    public static void driveAndGo(){
        System.out.println("Putting car into drive");
        System.out.println("Going forward");
    }

    public static void main(String[] args) {
        unlockCar();
        System.out.println("--------------------------");
        openDoor();
        System.out.println("--------------------------");
        sitInCar();
        System.out.println("--------------------------");
        getReadyToGo();
        System.out.println("--------------------------");
        startCar();
        System.out.println("--------------------------");
        driveAndGo();
    }
}
