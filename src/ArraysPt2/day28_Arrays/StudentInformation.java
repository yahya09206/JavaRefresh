package ArraysPt2.day28_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        String[] student1 = {"007", "James", "Bond", "7"};
        System.out.println(Arrays.toString(student1));


        String[] student2 = new String[4];
        student2[0] = "010";
        student2[1] = "Jamie";
        student2[2] = "Smith";
        student2[3] = "26";

        System.out.println(Arrays.toString(student2));

        Scanner scanner = new Scanner(System.in);
//        String[] student3 = new String[4];
//        System.out.println("Enter your id");
//        student3[0] = scanner.next();
//        System.out.println("Enter your name");
//        student3[1] = scanner.next();
//        System.out.println("Enter your last name");
//        student3[2] = scanner.next();
//        System.out.println("What is your batch number");
//        student3[3] = scanner.next();
//        System.out.println(Arrays.toString(student3));

        String[] student4 = new String[4];
        String[] questions = {"Enter your id", "Enter your first name", "Enter your last name", "What is your batch number"};

        for (int i = 0; i < 4; i++){
            System.out.println(questions[i]);
            student4[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(student4));

    }
}
