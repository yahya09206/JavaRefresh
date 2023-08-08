package day12_scanner;

import java.util.Scanner;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your age? ");
        int age = input.nextInt();

        if (age > 21){
            System.out.println("You can buy alcohol with your ID");
        }else {
            System.out.println("You are too young");
        }
    }
}
