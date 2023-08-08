package ArraysPt2.day28_Arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        // Ask the user the month number they want, print the month name

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("What month do you want");
        int num = scanner.nextInt();

        System.out.println(months[num - 1]);


    }
}
