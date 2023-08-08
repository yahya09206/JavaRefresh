package day16_String02;

public class StringMethods {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------");
        System.out.println("replace() + replaceFirst()");

        String email = "Cybertek@yahoo.com";
        email.replace("yahoo", "gmail");
        email = email;

        System.out.println(email);

        String sentence = "C# is cool, C# is fun";
        //sentence = sentence.replace("C#", "Java");
        sentence = sentence.replaceFirst("C#", "Java");


        System.out.println(sentence);

        String s = "Cat Dog Cat Dog Cat";
        //s = s.replace("Cat", "Dog");
        s = s.replaceFirst("Cat", "Dog");

        System.out.println(s);

        System.out.println("----------------------------------------------------------");
        System.out.println("indexOf() + lastIndexOf()");

        String sentence2 = "Java is a cool language";
        int indexOfFirstA = sentence2.indexOf("a");
        int indexOfSecondA = sentence2.indexOf("a ");
        int indexOfThirdA = sentence2.indexOf("a c");
        int indexOfFourthA = sentence2.indexOf("an");

        int indexOfFifthA = sentence2.lastIndexOf("a");

        System.out.println(indexOfSecondA);
        System.out.println(indexOfFirstA);
        System.out.println(indexOfThirdA);
        System.out.println(indexOfFourthA);
        System.out.println(indexOfFifthA);

        System.out.println("----------------------------------------------------------");
        System.out.println("isEmpty()");

        String s2 = "Hello";
        boolean r1 = s2.isEmpty();
        System.out.println("r1 = " + r1);

        System.out.println("----------------------------------------------------------");
        System.out.println("equals() + equalsIgnoreCase() only for comparing text");

        String str = "Cat";
        String str2 = new String("Cat");
        String str3 = new String("Cat");

        System.out.println(str.equals(str2));
        System.out.println(str == str2);

        System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));

        String word1 = "Java";
        String word2 = "java";

        System.out.println(word1 == word2);
        System.out.println(word1.equalsIgnoreCase(word2));




    }
}
