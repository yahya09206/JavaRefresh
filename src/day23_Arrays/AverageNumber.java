package day23_Arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int[] num1 = new int[scanner.nextInt()];
        int sum = 0;

        for (int i = 0; i <= num1.length - 1; i++){
            System.out.println("Enter a number:");
            // assign number to an index in the array
            num1[i] = scanner.nextInt();
            sum += num1[i];
        }

        System.out.println("sum = " + sum);
        double avg = (double) sum / num1.length;
        System.out.println("avg = " + avg);

    }
}
