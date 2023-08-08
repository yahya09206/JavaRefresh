package MethodsPt2.day33_VoidMethods;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year");
        int year2 = scanner.nextInt();
        calculateAge(year2);
        calculateAge(1991);
    }

    public static void calculateAge(int year){
        int age = 2022 - year;
        System.out.println(age);
    }
}
