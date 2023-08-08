package day23_Arrays;

public class MyClassmates {
    public static void main(String[] args) {


        // if we know what the elements are
        String[] friends = {"Sabit", "Ahmet", "Tugba", "Beryl", "Zulal"};
        System.out.println("Size: " + friends.length);

        for (int i = 0; i <= friends.length; i++){
            System.out.println(friends[i]);
        }

        String[] friends2 = new String[5]; // size 5
        System.out.println("Size: " + friends2.length);

        for (int i = 0; i <= friends2.length - 1; i++){
            System.out.println(friends2[i]);
        }
    }
}
