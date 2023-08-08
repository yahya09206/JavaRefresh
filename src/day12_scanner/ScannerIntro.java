package day12_scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the first number");
        int num1 = scan.nextInt();
        System.out.println("What is the second number");
        int num2 = scan.nextInt();

        System.out.println("Those two numbers added equals");
        int addition = num1 + num2;
        System.out.println(addition);

        System.out.println("Those two numbers subtracted equals");
        int subtraction = num1 - num2;
        System.out.println(subtraction);

        System.out.println("Those two numbers multiplied equals");
        int multiplication = num1 * num2;
        System.out.println(multiplication);

        System.out.println("Those two numbers divided equals");
        int division = num1 / num2;
        System.out.println(division);



    }
}
