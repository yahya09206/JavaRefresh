package day16_String02;

public class EmailAddress {
    public static void main(String[] args) {

        String email = "Cybertek@gmail.com";

        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.lastIndexOf(".");
        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println("domain = " + domain);
    }
}
