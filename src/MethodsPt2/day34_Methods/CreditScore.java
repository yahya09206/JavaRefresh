package MethodsPt2.day34_Methods;

public class CreditScore {
    public static void main(String[] args) {

        System.out.println(getCreditScore());

        System.out.println(isGoodCreditScore(getCreditScore()));
    }

    public static int getCreditScore(){
        return 720;
    }

    public static boolean isGoodCreditScore(int creditScore){
//        if (creditScore >= 700){
//            return true;
//        }else {
//            return false;
//        }
        return creditScore >= 700;
    }
}
