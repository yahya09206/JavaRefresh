package day12_scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first number?");
        int num1 = input.nextInt();

        System.out.println("What is your second number?");
        int num2 = input.nextInt();

        System.out.println("Total of both numbers: " + (num1 + num2));
        System.out.println("Total of both numbers: " + (num1 - num2));
        System.out.println("Total of both numbers: " + (num1 * num2));
        System.out.println("Total of both numbers: " + (num1 / num2));
    }
}
