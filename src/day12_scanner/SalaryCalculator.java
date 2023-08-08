package day12_scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your hourly rate?");
        double hourlyRate = scanner.nextDouble();

        System.out.println("How many hours do you work in a week?");
        int weeklyHour = scanner.nextInt();

        System.out.println("How many weeks do you work in a year?");
        int weeks = scanner.nextInt();

        double salary = hourlyRate * weeklyHour * weeks;

        System.out.println("You are making $" + hourlyRate + " per hour");
        System.out.println("You work " + weeklyHour + " hours in a week");
        System.out.println("Your salary is " + salary);


    }
}
