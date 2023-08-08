package ArraysPt2.day29_ForEach;

public class EvenAndOdd {
    public static void main(String[] args) {

        int[] nums = {4, 1, 3, 12, 5};
        int even = 0;
        int odd = 0;
        String evenNums = "";
        String oddNums = "";

//        for (int i = 0; i < nums.length; i++){
//            if (nums[i] % 2 == 0){
//                even++;
//            }else {
//                odd++;
//            }
//        }
//        System.out.println(even);
//        System.out.println(odd);

        System.out.println();

        for (int num : nums) {
            if (num % 2 == 0){
                even++;
                evenNums += num + " ";
            }else {
                odd++;
                oddNums += num + " ";
            }
        }
        System.out.println(even);
        System.out.println(odd);

        System.out.println("evenNums = " + evenNums);
        System.out.println("oddNums = " + oddNums);
    }
}
