package ArraysPt2.day29_ForEach;

public class ForEachExample {
    public static void main(String[] args) {

        int[] nums = {30, 12, 159, 12};

        for (int i = 0; i < nums.length; i++){
            System.out.println("traditional " + nums[i]);
        }

        System.out.println();

        for (int num : nums) {
            System.out.println(num);
        }

        System.out.println();

        String[] classes = {"java", "soft skills", "selenium", "database", "api"};
        for (int i = 0; i <= classes.length - 1; i++){
            System.out.println(classes[i]);
        }

        System.out.println();

        for (String aClass : classes) {
            System.out.println(aClass);
        }

        // double example
        System.out.println();

        double[] prices = {10.4, 40.2, 410.2};

        for (double price : prices) {
            System.out.println(price);
        }
    }
}
