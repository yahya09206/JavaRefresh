package ArraysPt2.day30_ToCharSplit;

public class ReverseMiddleWord {
    public static void main(String[] args) {

        String sentence = "monday is today";
        String[] words = sentence.split(" ");

        String reverse = "";

        char[] middleWord = words[1].toCharArray();

        for (int i = middleWord.length - 1; i >= 0; i--){
            reverse += middleWord[i];
        }

        System.out.println(words[0] + " " + reverse + " " + words[2]);
    }
}
