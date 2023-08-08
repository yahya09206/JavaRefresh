package Cydeo2.day38_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4};

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
        System.out.println(nums);

        System.out.println("-------------------------------------");

        // Creating an ArrayList with some initial values
        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(2, 34, 332, 32, 23));
        System.out.println(other);


    }
}
