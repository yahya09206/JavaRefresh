package day15_String;

public class StringIntro {
    public static void main(String[] args) {

        String str = "Cybertek";

        String s1 = "Cat";
        String s2 = "CAt";
        String s3 = "Cat";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println("----------------------");

        String s4 = new String("Dog");
        String s5 = new String("Dog");

        System.out.println(s4 == s5);
    }
}
