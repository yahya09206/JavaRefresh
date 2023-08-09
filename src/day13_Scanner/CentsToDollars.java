package day13_Scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Cents");
        int cents = scanner.nextInt();
        int dollars = cents / 100;
        int remainder = cents % 100;

        if (remainder == 0){
            System.out.println(cents + " is equal to " + dollars + " dollars");
        }else {
            System.out.println(cents + " is equal to " + dollars + " dollars and " + remainder + " cents");
        }

        System.out.println();
    }
}
