package day15_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first name");
        String firstName = scan.next();

        System.out.println("What is your last name");
        String lastName = scan.next();

        System.out.println("Your initials are " + firstName.charAt(0) + "." + lastName.charAt(0));

    }
}
