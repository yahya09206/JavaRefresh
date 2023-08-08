package ArraysPt2.day30_ToCharSplit;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "today is monday";

        String[] s = sentence.split(" ");
        String reversed = "";

        System.out.println(Arrays.toString(s));

        for (int i = s.length - 1; i >= 0; i--){
            reversed += s[i] + " ";
        }

        System.out.println(reversed);
    }
}
