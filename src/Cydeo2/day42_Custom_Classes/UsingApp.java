package Cydeo2.day42_Custom_Classes;

public class UsingApp {
    public static void main(String[] args) {

        App application = new App();
        application.name = "cydeo";
        application.version = 5.5;
        application.isFree = true;

        // must call by the object
        System.out.println(application.name);
        application.run();
        application.update();

    }
}
