package ArraysPt2.day31_ArraysClass;

public class AWS {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "use-east,us-west1,use-west2,us-west3";

        String[] allZone = zones.split(",");

        for (String eachZone : allZone){
            System.out.println(app + " is deploying on " + eachZone);
        }
    }
}
