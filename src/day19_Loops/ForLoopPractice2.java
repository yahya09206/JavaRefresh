package day19_Loops;

public class ForLoopPractice2 {
    public static void main(String[] args) {

        System.out.println("Print A-Z");

        for (char i = 'a'; i <= 'z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 65; i <= 90; i++){
            System.out.print((char) i + " ");
        }
        System.out.println();

        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("---------------------------------------------");
        for (char i = 20; i <= 100; i++){
            System.out.print(i + " ");
        }
    }
}
