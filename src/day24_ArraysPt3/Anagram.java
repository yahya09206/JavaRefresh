package day24_ArraysPt3;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        // heart & earth

        String s1 = "heart";
        String s2 = "earth";

        char[] s3 = s1.toCharArray();
        char[] s4 = s2.toCharArray();

        Arrays.sort(s3);
        Arrays.sort(s4);

        boolean isAnagram = Arrays.equals(s3, s4);

        System.out.println("isAnagram = " + isAnagram);
    }
}
