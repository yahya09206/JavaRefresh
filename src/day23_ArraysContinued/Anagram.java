package day23_ArraysContinued;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "race";
        String s2 = "care";

        char[] s3 = s1.toCharArray();
        char[] s4 = s2.toCharArray();

        Arrays.sort(s3);
        Arrays.sort(s4);


        System.out.println(Arrays.toString(s3));
        System.out.println(Arrays.toString(s4));

        boolean isAnagram = Arrays.equals(s3, s4);

        System.out.println(isAnagram);
    }
}
