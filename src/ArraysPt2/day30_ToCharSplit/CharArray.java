package ArraysPt2.day30_ToCharSplit;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        char[] letters = {'j', 'a', 'v', 'a'};

        String word = "java";

        char[] java = word.toCharArray();

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));

        for (char each : java) {
            System.out.println(each);
        }


        System.out.println("----------------------------------");

        char[] day = {'m', 'o', 'n', 'd', 'a', 'y'};
        System.out.println(day.length);

        String strDay = new String(day);
        System.out.println(strDay);


    }
}
