package day12_scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("Number was even");
        }else {
            System.out.println("Number was odd");
        }
    }
}
