package day13_Scanner;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your job title");
        String title = scan.nextLine();

        System.out.println("title = " + title);
    }
}
