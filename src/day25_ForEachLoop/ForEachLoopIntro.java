package day25_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("-------------------------------------");

        String[] names = {"Ahmet", "Boburbek", "Farid", "Robinson"};

        for (String name : names) {
            System.out.println(name);
        }
    }
}
