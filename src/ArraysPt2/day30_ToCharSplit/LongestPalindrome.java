package ArraysPt2.day30_ToCharSplit;

public class LongestPalindrome {
    public static void main(String[] args) {

        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrome = "";

        for (String each : words) {

            boolean isPalindrome = true;

            for (int i = 0; i <= each.length() - 1; i++){

                if (each.charAt(i) != each.charAt(each.length() - 1 - i)){
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome && each.length() > longestPalindrome.length()){
                longestPalindrome = each;
            }
        }

        System.out.println(longestPalindrome.isEmpty() ? "No Palindrome" : longestPalindrome);
    }
}
