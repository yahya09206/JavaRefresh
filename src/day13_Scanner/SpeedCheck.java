package day13_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        int speedLimit = 35;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your current speed");
        int currentSpeed = scanner.nextInt();

        int overSpeedLimit = currentSpeed - speedLimit;

        if (overSpeedLimit > 0){
            System.out.println("You are driving " + overSpeedLimit + " miles over speed limit. Slow Down!");
        }else {
            System.out.println("Good Job!");
        }
    }
}
