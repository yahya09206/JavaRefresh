package day25_ForEachLoop;

import java.util.Arrays;

public class MergeThreeArrays {
    public static void main(String[] args) {


        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};
        int[] arr3 = {7,8,9,10,11};

        int[] arr4 = new int[arr1.length + arr2.length + arr3.length];

        int j = 0; // to store index of 3rd array
        for (int i = 0; i < arr1.length; i++){
            arr4[j++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++){
            arr4[j++] = arr2[i];
        }

        for (int i = 0; i < arr3.length; i++){
            arr4[j++] = arr3[i];
        }

        System.out.println(Arrays.toString(arr4));
    }
}
