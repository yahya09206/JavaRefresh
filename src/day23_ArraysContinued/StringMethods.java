package day23_ArraysContinued;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        System.out.println("split()");
        String sentence = "I love learning java programming language";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = words.length - 1; i >= 0; i--) {

            System.out.print(words[i] + " ");
        }

        System.out.println();
        String email = "Cybertek@gmail.com";
        String split = email.split("@")[0];

        System.out.println(split);

        System.out.println("-----------------------------------------------------------");
        System.out.println("toCharArray()");

        String str = "ABCDE!";
        char[] characters = str.toCharArray();

        System.out.println(Arrays.toString(characters));
    }
}
