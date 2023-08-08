package MethodsPt2.day35_MethodsCont;

import my_utilities.ArrayUtil;

public class UsingArrayUtil {
    public static void main(String[] args) {

        int[] arr = {34, 45, 54, 3, 45, -1, 433};
        System.out.println(ArrayUtil.minNumber(arr));
        System.out.println(ArrayUtil.maxNumber(arr));
        System.out.println(ArrayUtil.arrayContains(arr, 9));
    }
}
