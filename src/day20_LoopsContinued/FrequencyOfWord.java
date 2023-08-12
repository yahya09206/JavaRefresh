package day20_LoopsContinued;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "Java Java";
        int count = 0;

        for (int i = 0; i <= sentence.length() - 4; i++){
            String string = sentence.substring(i, i + 4);
            if (string.equals("Java")){
                count++;
            }
        }

        System.out.println(count);

//        String string = sentence.substring(0, 4);
//        String string2 = sentence.substring(1, 5);
//        String string3 = sentence.substring(2, 6);
//        String string4 = sentence.substring(3, 7);
//        String string5 = sentence.substring(4, 8);
//        String string6 = sentence.substring(5, 9);
//
//        System.out.println(string4);
    }
}
