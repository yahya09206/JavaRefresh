package ArraysPt2.day28_Arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        // with normal variables
        String cityOne = "Chicago";
        String cityTwo = "New York";
        String cityThree = "Houston";
        String cityFour = "Denver";
        String cityFive = "Pittsburgh";

        // declare array with values
        String[] cities = {"Chicago", "New York", "Houston", "Denver", "Pittsburgh"};

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        System.out.println("---------------------------------");

        // print all the cities on one line
        System.out.println("Reverse order of the cities: " + cities[4] + ", " + cities[3] + ", " + cities[2] + ", " + cities[1] + ", " + cities[0]);

        System.out.println("---------------------------------");
        // print the array all at one time
        System.out.println(Arrays.toString(cities));
        System.out.println("---------------------------------");
        for (int i = 0; i <= cities.length - 1; i++){
            System.out.println(cities[i]);
        }

        System.out.println("---------------------------------");

        System.out.println(cities.length);

    }
}
