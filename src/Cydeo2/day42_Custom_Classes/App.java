package Cydeo2.day42_Custom_Classes;

public class App {

    String name;
    double version;
    boolean isFree;

    public void run(){
        System.out.println(name + " is running");
    }

    public void update(){
        System.out.println(name + " is updating");
        version += 1.1;
    }

    public static void main(String[] args) {

        App app1 = new App();
        app1.name = "Maze Runner";
        app1.version = 1;
        app1.isFree = false;

        // we cannot call instance methods like this
        // App1.run();

        app1.run();
        app1.update();

        System.out.println(app1.name);
        System.out.println(app1.version);
        System.out.println(app1.isFree);
    }
}
