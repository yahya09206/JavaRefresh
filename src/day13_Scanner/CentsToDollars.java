package day13_Scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Cents");
        int cents = scan.nextInt(); // 225 == 2.25 --> cut off the decimal
        int dollarAmount = cents / 100; // 2
        int remainder = cents % 100; // 25

        if (cents >= 0){
            if (remainder == 0){
                System.out.println(cents + " is equal to " + dollarAmount + " dollars");
            }else {
                System.out.println(cents + " is equal to " + dollarAmount + " dollars and " + remainder + " cents");
            }
        }else{
            System.out.println("Input is invalid");
        }
    }
}
