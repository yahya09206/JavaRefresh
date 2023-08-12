package day21_WhileLoop;

public class SumOfDigits {
    public static void main(String[] args) {

        String string = "A1B2C3";
        int sum = 0;

        for (int i = 0; i <= string.length() - 1; i++){
            char each = string.charAt(i);
            System.out.println("each = " + each);

            if (each >= '0' && each <= '9'){
                sum += each - '0';
            }
        }

        System.out.println("sum = " + sum);
    }
}
