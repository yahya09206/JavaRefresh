package MethodsPt2.day35_MethodsCont;

public class CurrencyConverter {
    public static void main(String[] args) {

        System.out.println(convert("euro", 100));
        System.out.println(convert("won", 100));

    }

    public static double convert(String curr, double amount){

        switch (curr.toLowerCase()){

            case "euro":
                return amount * .91;
            case "yen":
                return amount * 121.03;
            case "lira":
                return amount * 14.85;
            case "won":
                return amount * 1_217.52;
            case "rupee":
                return amount * 181.45;
            default:
                return 0;
        }
    }
}
