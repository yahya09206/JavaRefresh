package ArraysPt2.day30_ToCharSplit;

import java.util.Arrays;

public class SplitExamples {
    public static void main(String[] args) {

        String s  = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";

        String[] days = s.split(",");

        System.out.println(Arrays.toString(days));

        for (String day : days) {
            System.out.println(day);
        }
    }
}
