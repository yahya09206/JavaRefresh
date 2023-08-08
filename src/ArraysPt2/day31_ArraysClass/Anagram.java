package ArraysPt2.day31_ArraysClass;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "earth";
        String str2 = "heart";

        char[] str3 = str1.toCharArray();
        char[] str4 = str2.toCharArray();

        Arrays.sort(str3);
        Arrays.sort(str4);

        boolean isAnagram = Arrays.equals(str3, str4);

        System.out.println(isAnagram);
    }
}
