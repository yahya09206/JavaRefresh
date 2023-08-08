package MethodsPt2.day34_Methods;

import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {

        System.out.println(numberAsWord(3));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(numberAsWord(scanner.nextInt()));

    }

    public static String numberAsWord(int num){

        if (num < 1 || num > 10){
            return num + " is an invalid Number";
        }

        String[] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        return words[num - 1];
    }
}
