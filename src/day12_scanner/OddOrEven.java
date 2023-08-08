package day12_scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println((number % 2 != 0)? "Odd": "Even");

        System.out.println((number > 0)? "Positive" :(number < 0)? "Negative": "Zero");
    }
}
