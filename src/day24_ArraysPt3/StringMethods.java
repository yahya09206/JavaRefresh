package day24_ArraysPt3;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String sentence = "I love learning java programming language";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i]+ " ");
        }
    }
}
