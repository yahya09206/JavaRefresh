package day15_String;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Muhtar";
        char ch = str.charAt(0);

        System.out.println("ch = " + ch);

        String word = "Cybertek School";
        char ch2 = word.charAt(9);
        System.out.println("ch1 = " + ch2);

        String word2 = "Java";
        char ch3 = word2.charAt(2);
        System.out.println("ch3 = " + ch3);

        System.out.println("--------------------------------------");

        String sentence = "Hello everyone, how are you all today?";
        int totalNumberOfChars = sentence.length();
        System.out.println("totalNumberOfChars = " + totalNumberOfChars);

        String s1 = "Cybertek";

        int lastIndex = s1.length() - 1;

        char firstCharacter = s1.charAt(0);
        char secondCharacter = s1.charAt(7);

        System.out.println("lastIndex = " + lastIndex);

        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("secondCharacter = " + secondCharacter);

        System.out.println("--------------------------------------");

        String firstName = "John";
        String lastName = "King";

        String fullName = firstName.concat(" " + lastName);
        System.out.println("fullName = " + fullName);

        System.out.println("--------------------------------------");
        String s = "cybertek";
        s.toUpperCase();
        System.out.println("s = " + s);

        System.out.println("--------------------------------------");
        String s2 = "JAVA PROGRAMMING LANGUAGE";
        s2.toLowerCase();
        System.out.println("s = " + s2);

        System.out.println("--------------------------------------");
        String schoolName = " Cybertek School  ";
        schoolName = schoolName.trim();
        System.out.println("schoolName = " + schoolName);


    }
}
