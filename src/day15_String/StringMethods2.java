package day15_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String sentence = "Java Programming Language";

        String name = sentence.substring(0, 4);

        System.out.println("name = " + name);

        String s2 = "Cybertek School";
        String subTek = s2.substring(0, 8);
        System.out.println(subTek);

        System.out.println("--------------------------------------");
        String sentence2 = "Java is a programming language";

        String name4 = sentence2.substring(10);
        System.out.println(name4);

        String name5 = sentence2.substring(10, 20+1);
        System.out.println(name5);

    }
}
