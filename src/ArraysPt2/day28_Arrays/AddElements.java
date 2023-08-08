package ArraysPt2.day28_Arrays;

public class AddElements {
    public static void main(String[] args) {

        int[] arr = {3, 6, 10};

        int sum = arr[0] + arr[1] + arr[2];
        int sum2 = 0;

        for (int i = 0; i < arr.length; i++){
            sum2 += arr[i];
        }

        System.out.println(sum);
        System.out.println(sum2);
    }
}
