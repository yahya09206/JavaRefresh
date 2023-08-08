package day23_Arrays;

public class HighestAndLowestScores {
    public static void main(String[] args) {

        int[] numbers = {85, 70, 95, 90, 100};
        String[] names = {"Mike", "Adam", "Tonny", "John", "Ammy"};
        int max = numbers[0];
        int min = numbers[0];
        String maxName = "";
        String minName = "";

        for (int i = 0; i <= numbers.length - 1; i++){
            int each = numbers[i];
            String eachName = names[i];


            if (each > max){
                max = each;
                maxName = eachName;
            }

            if (each < min){
                min = each;
                minName = eachName;
            }
        }
        System.out.println("max = " + max + " " + maxName);
        System.out.println("min = " + min + " " + minName);
    }
}
