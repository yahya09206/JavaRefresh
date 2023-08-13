package day23_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] group1 = {"Feruza", "Yuliang", "Tamara", "Ahmet"};

        System.out.println(Arrays.toString(group1));

        System.out.println(group1[2]);

        for (int i = 0; i <= group1.length - 1; i++){
            System.out.println(group1[i]);
        }
    }
}
