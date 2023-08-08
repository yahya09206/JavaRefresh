package Cydeo2.day38_ArrayLists;

import java.util.ArrayList;

public class ClassroomTwo {
    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        group.add("Ziba");
        System.out.println(group);

        group.add(0, "Lina");
        System.out.println(group);

        group.add("Ozi");
        System.out.println(group);

        group.add(1, "James");
        System.out.println(group);

        System.out.println(group.add("Emre"));
    }
}
