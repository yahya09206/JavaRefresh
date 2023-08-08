package ArraysPt2.day29_ForEach;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {


        String[] bankAccountOne = {"John Doe", "Checking", "012345679", "3500.00"};
        System.out.println(bankAccountOne.length);
        System.out.println(Arrays.toString(bankAccountOne));
        System.out.println("Name: " + bankAccountOne[0]);
        System.out.println("Account Type: " + bankAccountOne[1]);
        System.out.println("Account Number: " + bankAccountOne[2]);
        System.out.println("Balance: " + bankAccountOne[3]);

        System.out.println("---------------------------------------------------");

        String[] bankAccountTwo = new String[4];
        System.out.println(Arrays.toString(bankAccountTwo));
        bankAccountTwo[0] = "Jane Doe";
        bankAccountTwo[1] = "Savings";
        bankAccountTwo[2] = "9876543210";
        bankAccountTwo[3] = "80000";
        System.out.println(Arrays.toString(bankAccountTwo));

        System.out.println("---------------------------------------------------");

        String[] bankAccountThree = new String[4];
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your first name");
//        bankAccountThree[0] = scan.nextLine();
//        System.out.println("Enter your account type");
//        bankAccountThree[1] = scan.nextLine();
//        System.out.println("Enter your account number");
//        bankAccountThree[2] = scan.nextLine();
//        System.out.println("Enter your balance");
//        bankAccountThree[3] = scan.nextLine();
//        System.out.println(Arrays.toString(bankAccountThree));

        System.out.println("---------------------------------------------------");

        String[] bankAccountFour = new String[4];
        String[] questions = {"name?", "account type", "account number", "balance?"};
        for (int i = 0; i <= bankAccountFour.length - 1; i++){
            System.out.println("Enter your: " + questions[i]);
            bankAccountFour[i] = scan.nextLine();
        }

        System.out.println(Arrays.toString(bankAccountFour));

    }
}
