package day20_LoopsContinued;

public class FactorialNumber {
    public static void main(String[] args) {

        int number = 3;
        int result = 1;

        for (int i = number; 1 <= i; i--){
            result *= i;
        }

        System.out.println(result);
    }
}
