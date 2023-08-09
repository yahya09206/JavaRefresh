package day13_Scanner;

import java.util.Scanner;

public class NextMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scanner.next(); // only takes the first word
        System.out.println("Enter your last name");
        String lastName = scanner.next();

        String fullName = firstName + " " + lastName;

        System.out.println("fullName = " + fullName);

        System.out.println("Enter your address");
        String address = scanner.next();

        System.out.println("address = " + address);
    }
}
