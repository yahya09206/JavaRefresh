package day16_String02;

public class Email {
    public static void main(String[] args) {

        String email = "Cybertek@yahoo.com";
        email = email.replace("yahoo", "gmail");

        System.out.println(email);

        String sentence = "C# is cool, C# is fun";
        sentence = sentence.replace("C#", "Java");

        System.out.println(sentence);
    }
}
