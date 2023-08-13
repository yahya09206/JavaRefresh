package day23_Arrays;

public class MyClassmates {
    public static void main(String[] args) {

        // If we don't know what the elements are, but we do know how many elements we want to store
        String[] friends = new String[5];
        System.out.println("size: " + friends.length);
        friends[0] = "Dilem";
        friends[1] = "Mohammed";
        friends[2] = "Komiljon";
        friends[3] = "Esraa";
        friends[4] = "Kemal";

        for (int i = 0; i <= friends.length - 1; i++){
            System.out.println(friends[i]);

        }
    }
}
