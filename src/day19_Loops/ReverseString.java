package day19_Loops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--){
            reverse += name.charAt(i);
        }
        System.out.println("name = " + reverse);
    }
}
