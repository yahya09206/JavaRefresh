package day12_scanner;

import java.util.Scanner;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        if (age >= 21){
            System.out.println("You are eligible w/ ID");
        }else {
            System.out.println("Sorry you are too young, legal age is 21 w/ ID");
        }
    }
}
