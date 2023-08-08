package Cydeo2.day46_Static;

public class ShopAtBestBuy {
    public static void main(String[] args) {

        // Access the static members by the class name
        System.out.println(BestBuy.headquarters);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.numberOfCommpters);

        BestBuy storeOne = new BestBuy("Oak Drive");
        System.out.println(storeOne.location);
        System.out.println(storeOne.numberOfCommpters);

        storeOne.numberOfCommpters--;

        System.out.println(storeOne.numberOfCommpters);

        BestBuy storeTwo = new BestBuy("Main St");

        storeTwo.numberOfCommpters -= 5;
        System.out.println(storeOne.numberOfCommpters);
        System.out.println(BestBuy.numberOfCommpters);

        storeTwo.location = "Fairfax";
        System.out.println(storeOne.location);
        System.out.println(storeTwo.location);

        BestBuy.restock();
        System.out.println(BestBuy.numberOfCommpters);
        BestBuy.restock();
        System.out.println(BestBuy.numberOfCommpters);

        storeOne.openStore();
        storeTwo.openStore();

    }
}
