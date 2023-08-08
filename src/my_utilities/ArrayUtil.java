package my_utilities;

public class ArrayUtil {

    // Method to return the smallest number in array
    public static int minNumber(int[] nums){

        int min = nums[0];

        for (int num : nums) {
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    // Method to return the largest number in array
    public static int maxNumber(int[] nums){

        int max = nums[0];

        for (int num : nums) {
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    // Method to return array that contains a certain element
    public static boolean arrayContains(int[] arr, int num){

        for (int i : arr) {
            if (i == num){
                return true;
            }
        }
        return false;
    }
}
