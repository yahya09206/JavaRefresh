package day23_ArraysContinued;

public class UniqueNumbers {
    public static void main(String[] args) {

        int[] num = {1,1,2,3,3,4};

        for (int j = 0; j < num.length; j++){
            int unique = num[j];
            int count = 0;


            for (int i = 0; i <= num.length - 1; i++){

                if (num[i] == unique){
                    count++;
                }
            }

            if (count == 1){
                System.out.println(unique);
            }
        }

    }
}
