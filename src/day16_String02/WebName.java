package day16_String02;

public class WebName {
    public static void main(String[] args) {

        String url = "www.cybertek.com";

        int beginning = url.indexOf(".") + 1;
        int end = url.lastIndexOf(".");
        int domain = url.lastIndexOf(".");

        String name = url.substring(beginning, end);
        String name2 = url.substring(domain);

        System.out.println("name = " + name + name2);


    }
}
