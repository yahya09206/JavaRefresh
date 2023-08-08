package day13_Scanner;

import java.util.Scanner;

public class NextMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        String fullName = firstName + " " + lastName;

        System.out.println("fullName = " + fullName);

        scan.nextLine();

        System.out.println("Enter your address");
        String address = scan.nextLine();

        System.out.println("address = " + address);

    }
}
