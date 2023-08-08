package day20_LoopsContinued;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String sentence = "Python Python Python";
        // store word in variable
        String word = "Python";

        int count = 0;

        // subtract length of word from sentence to keep track of it
        for (int i = 0; i <= sentence.length() - word.length(); i++){
            // set to track amount of times word is present
            String each = sentence.substring(i, i+word.length());
            System.out.println(each);
            if (each.equals(word)){
                // add to count variable
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
