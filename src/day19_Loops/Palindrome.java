package day19_Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word");
        String name = scanner.nextLine();
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--){
            reverse += name.charAt(i);
        }
//        if (reverse.equals(name)){
//            System.out.println("Palindrome");
//        }else {
//            System.out.println("Word is not a Palindrome");
//        }
        boolean isPalindrome = name.equals(reverse);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
