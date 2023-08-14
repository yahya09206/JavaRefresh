package Cydeo2.day37_ArrayLists;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        // add/assign to an array [index] = value
        numbers.add(100);
        System.out.println(numbers);

        numbers.add(-100);
        System.out.println(numbers);
        numbers.add(50);
        numbers.add(30);
        System.out.println(numbers);

        // arraylist has methods to select values
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));

        // size() to find out the length of an arrayList
        System.out.println(numbers.size());

    }
}
