package day15_String;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Muhtar";

        char ch1 = str.charAt(0);

        System.out.println("ch1 = " + ch1);

        String word = "Cybertek School";
        char ch2 = word.charAt(9);
        System.out.println("ch2 = " + ch2);

        String word2 = "Java";
        char ch3 = word2.charAt(2);
        System.out.println("ch3 = " + ch3);
        System.out.println("-----------------------------");

        String sentence = "Hello everyone, how are you all today?";
        int totalNumberofChars = sentence.length();
        System.out.println("totalNumberofChars = " + totalNumberofChars);
        
        String s1 = "Cybertek";
        System.out.println("s1.charAt(s1.length() - 1) = " + s1.charAt(s1.length() - 1));
    }
}
