package day23_Arrays;

import java.util.Scanner;

public class DaysInAWeek {
    public static void main(String[] args) {

        String[] days = {"Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"};

        System.out.println("Enter a number");
        int num = new Scanner(System.in).nextInt();

        System.out.println(days[num - 1]);
    }
}
