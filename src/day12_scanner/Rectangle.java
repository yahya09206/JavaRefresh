package day12_scanner;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the width of the rectangle");
        int width = scan.nextInt();
        System.out.println("What is the length of the rectangle");
        int length = scan.nextInt();

        int area = width * length;
        int perimeter = (width + length) * 2;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
