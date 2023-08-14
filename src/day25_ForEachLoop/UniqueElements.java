package day25_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"java", "java", "python", "c#"};


        for (String word : words) {
            int count = 0;
            for (String each : words) {
                if (each.equals(word)){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(word);
            }
        }
    }
}
