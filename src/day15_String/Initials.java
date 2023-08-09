package day15_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = scanner.next();
        System.out.println("Please enter your last name");
        String lastName = scanner.next();

        String fullName = firstName.charAt(0) + "." + lastName.charAt(0);

        System.out.println("fullName = " + fullName);
    }
}
