package ArraysPt2.day29_ForEach;

public class AverageNumbers {
    public static void main(String[] args) {

        int[] nums = {10, 15, 5, 6};
        int sum = 0;

        for (int i = 0; i <= nums.length - 1; i++){
            sum += nums[i];
        }

        double avg = sum / nums.length;
        System.out.println("avg = " + avg);

        System.out.println();

        for (int num : nums) {
            sum += num;
        }
        System.out.println(avg);
    }
}
