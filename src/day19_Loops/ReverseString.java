package day19_Loops;

public class ReverseString {
    public static void main(String[] args) {

        String name = "Jack";
        String result = "";

        for (int i = name.length() - 1; i >= 0; i--){
            result += name.charAt(i);
        }
        System.out.println("result = " + result);
    }
}
