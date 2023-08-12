package day20_LoopsContinued;

public class CatsAndDogs {
    public static void main(String[] args) {

        String sentence = "Cat Dog Dog Cat";
        int numberOfCats = 0;
        int numberOfDogs = 0;

        for (int i = 0; i <= sentence.length() - 3; i++){
            String each = sentence.substring(i, i + 3);
            System.out.println(each);

            if (each.equals("Cat")){
                numberOfCats++;
            }
            if (each.equals("Dog")){
                numberOfDogs++;
            }
        }
        System.out.println("numberOfCats = " + numberOfCats);
        System.out.println("numberOfDogs = " + numberOfDogs);
    }
}
