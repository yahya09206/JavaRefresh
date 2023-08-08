package MethodsPt2.day33_VoidMethods;

public class GetCharacters {

    public static void getAThruZ(){
        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void getAThruZ2(){
        for (char i = 'a'; i <= 'z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void getZThruA(){
        for (char i = 'z'; i >= 'a'; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void get1Thru9(){
        for (int i = 0; i <= 9; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        getAThruZ();
        System.out.println("----------------------");
        getAThruZ2();
        System.out.println("----------------------");
        getZThruA();
        System.out.println("----------------------");
        get1Thru9();
    }


}
