package Cydeo2.day46_Static;

public class BestBuy {

    String location;
    static String headquarters = "Richfield Minnesota, United States";
    static String day = "Wednesday";
    static int numberOfCommpters = 100;

    public BestBuy(String location) {
        this.location = location;
    }

    public void openStore(){
        System.out.println("Opening the " + location);
    }

    public static void restock(){
        numberOfCommpters += 20;
    }
}
