package day19_Loops;

public class ForLoopPractice2 {
    public static void main(String[] args) {

        for (int i = 65; i <= 90; i++){
            System.out.print((char) i + " ");
        }
        System.out.println();

        System.out.println("--------------------------");

        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }

        for (char i = 1000; i <= 30000; i++){
            System.out.print(i + " ");
        }
    }
}
