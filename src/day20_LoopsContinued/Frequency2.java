package day20_LoopsContinued;

public class Frequency2 {
    public static void main(String[] args) {

        String sentence = "I love books, I purchased a lot of books";
        String word  = "book";
        int count = 0;

        for (int i = 0; i <= sentence.length() - word.length(); i ++){
            String each = sentence.substring(i, i + word.length());
            System.out.println(each);

            if (each.equals(word)){
                count++;
            }
        }

        System.out.println("count = " + count);
    }
}
