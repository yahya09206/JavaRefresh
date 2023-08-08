package day11_switch;

public class SwitchStatement2 {
    public static void main(String[] args){

        String name = "chrome";

        switch (name){

            case "chrome":
                System.out.println("You are using the best browser");
                break;
            case "firefox":
                System.out.println("Browser with faster cache clearing");
                break;
            default:
                System.out.println("Nothing else really");
                break;
        }
    }
}
