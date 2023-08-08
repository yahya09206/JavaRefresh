package day23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1-12:");
        int num = scanner.nextInt();


        if (num >= 1 && num <= 12){
            System.out.println(months[num - 1]);
        }else {
            System.out.println("Invalid Number");
        }
    }
}
