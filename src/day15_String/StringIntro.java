package day15_String;

public class StringIntro {
    public static void main(String[] args) {

        String str = "Cybertek";
        String str2 = new String("Cybertek");

        System.out.println("------------------------------");

        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = "Cat";

        System.out.println(s1 == s2 && s1 == s3);

        System.out.println("------------------------------");

        String s4 = new String("Cat");
        String s5 = new String("Cat");
        String s6 = s4;

        System.out.println(s4 == s5);
        System.out.println(s4 == s6);
    }
}
