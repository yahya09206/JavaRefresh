package ArraysPt2.day29_ForEach;

public class ReverseArray {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5};

        for (int i = num.length - 1; i >= 0; i--){
            System.out.print(num[i] + " ");
        }
    }
}
