package day20_LoopsContinued;

public class Frequency {
    public static void main(String[] args) {

        String sentence = "Java Java";
        int frequency = 0;

        for (int i = 0; i <= sentence.length() - 4; i++){
            // break them down to each length of the word
            String each = sentence.substring(i, i+4);
            System.out.println(each);
            if (each.equals("Java")){
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
