package MethodsPt2.day36_MethodsCont;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int[] arr2 = addElement(arr, 4);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] addElement(int[] original, int elementToAdd){

        int[] newArray = new int[original.length + 1];
        for (int i = 0; i < original.length; i++){
            newArray[i] = original[i];
        }
        newArray[newArray.length - 1] = elementToAdd;
        return newArray;
    }

    public static String[] addElement(String[] original, String element){

        return null;
    }
}
