package day23_ArraysContinued;

public class Classmates {
    public static void main(String[] args) {

        String[] names = {"Gulistan", "Feruza", "Ahmet", "Mehmet", "Muhtar", "Tamara", "Abbos", "Shirin", "Robinson", "Shirin"};


        for (int i = 0; i <=  names.length - 1; i++){
            System.out.println(names[i].substring(0,3));
        }
    }
}
