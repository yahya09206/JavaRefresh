package ArraysPt2.day29_ForEach;

public class LongestAndShortestStrings {
    public static void main(String[] args) {

        String[] str = {"apple", "java", "computer", "water"};
        String smallest = str[0];
        String biggest = str[0];

        for (int i = 0; i <= str.length - 1; i++){

            if (str[i].length() > biggest.length()){
                biggest = str[i];
            }

            if (str[i].length() < smallest.length()){
                smallest = str[i];
            }
        }

        System.out.println(smallest);
        System.out.println(biggest);
    }
}
