package day20_LoopsContinued;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        int number = new Scanner(System.in).nextInt();
        int result = 1;

        for (int i = number; 1 <= i; i--){
            result *= i;
        }

        System.out.println(result);
    }
}
