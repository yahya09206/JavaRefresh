package day13_Scanner;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles");
        int mileage = scanner.nextInt();
        double kilometers = mileage * 1.609;

        System.out.println(mileage + " miles equal to " + kilometers + " kilometers");
    }
}
