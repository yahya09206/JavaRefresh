package day27_ArrayRecap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {

        String str = "aaaabccddefgggh";

        for (char each : str.replace(" ", " ").toCharArray()){

            if (str.indexOf(each) == str.lastIndexOf(each)) {
                System.out.println(each);
            }
        }
    }
}
