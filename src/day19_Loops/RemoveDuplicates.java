package day19_Loops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String name = "ababbbaaa";
        String result = "";

        for (int i = 0; i <= name.length() - 1; i++){
            if (!result.contains("" + name.charAt(i))){
                result += name.charAt(i);
            }
        }
        System.out.println(result);
    }
}
