package day23_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] group1 = {"Feruza", "Yuliang", "Tamara", "Ahmet"};

        // retrieve data from array:
        System.out.println("group1[1] = " + group1[1]);
        System.out.println("group1[2] = " + group1[2]);

        System.out.println("-----------------------------------------------------");
        for (int i = 0; i <= group1.length; i++){
            System.out.println(group1[i]);
        }
        System.out.println("Arrays.toString(group1) = " + Arrays.toString(group1));
    }
}
