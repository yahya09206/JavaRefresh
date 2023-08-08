package ArraysPt2.day28_Arrays;

public class MaxMin {
    public static void main(String[] args) {

        int[] nums = {14,32,45,3344,4,345};
        int max = -2147483647;
        int min = 2147483647;

        for (int i = 0; i <= nums.length - 1; i++){
            int each = nums[i];
            System.out.println(each);

            if (each > max){
                max = each;
            }

            if (each < min){
                min = each;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
