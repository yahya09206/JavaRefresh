package day13_Scanner;

import java.util.Scanner;

public class FreeShipping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price of the item");
        double price = scanner.nextDouble();

        System.out.println("Are you a prime member?");
        boolean isPrime = scanner.nextBoolean();

        double totalCost = (isPrime)? price : price + 3.99;

        System.out.println("totalCost = " + totalCost);
    }
}
