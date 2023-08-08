package day25_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};

        int[] arr3 = new int[arr1.length + arr2.length];

        int j = 0; // to store index of 3rd array
        for (int i = 0; i < arr1.length; i++){
            arr3[j++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++){
            arr3[j++] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));
    }
}
