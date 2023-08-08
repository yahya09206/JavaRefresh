package day19_Loops;

import java.util.Scanner;

public class ForLoopPractice3 {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++){
            if (i % 15 == 0){
                System.out.print("FINRA ");
            }else if (i % 3 == 0){
                System.out.print("Fin ");
            }else if (i % 5 == 0){
                System.out.print("RA ");
            }else {
                System.out.print(i + " ");
            }
        }

        System.out.println("---------------------------------------------");

        for (int i = 1; i <= 8; i++){
            System.out.println("\t\t******");
        }

        System.out.println("---------------------------------------------");
        System.out.println("******");
        for (int i = 1; i <= 8; i++){
            System.out.println("*    *");
        }
        System.out.println("******");

        System.out.println("---------------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println(sum);

        System.out.println("---------------------------------------------");


    }
}
