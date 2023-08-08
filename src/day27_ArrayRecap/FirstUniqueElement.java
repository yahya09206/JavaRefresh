package day27_ArrayRecap;

public class FirstUniqueElement {
    public static void main(String[] args) {

        int a;

        int[] array = {1,2,1,3,3,3,4,5,5,5,6,6,7,7,8};
        int firstUniqueElement = 0;

        for (int j = 0; j < array.length; j++){
            int count = 0;
            for (int i = 0; i < array.length; i++){
                if (array[i] == array[j]){
                    count++;
                }
            }

            if (count == 1){
                firstUniqueElement = array[j];
                break;
            }
        }



        System.out.println("firstUniqueElement = " + firstUniqueElement);
    }
}
