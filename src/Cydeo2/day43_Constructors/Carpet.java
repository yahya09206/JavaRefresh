package Cydeo2.day43_Constructors;

public class Carpet {

    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet(boolean inputPersian, double
            inputWidth, double inputLength, double inputUnitPrice){

        width = inputWidth;
        length = inputLength;
        isPersian = inputPersian;
        unitPrice = inputUnitPrice;
        calculatePrice();
    }

    public void calculatePrice(){
        totalPrice = width * length * unitPrice;

        if (isPersian){
            totalPrice += 200;
        }
    }

    public String toString(){

        return (isPersian ? "The Persian Carpet " : "The Carpet ") +
                "\nhas deminsions of " + length + " x " + length + " x " + width +
                "\nThe unit price is $" + unitPrice +
                "\nAll coming to a total of $" + totalPrice;
    }
}
