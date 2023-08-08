package Cydeo2.day49_Inheritance;

public class GoToClass {
    public static void main(String[] args) {

        Person person = new Person();
        person.name = "James";
        person.favoriteHobby = "gym";
        person.age = 32;

        System.out.println();

        Student student = new Student();
        student.funLevel = 12;
        student.talk();
        student.study();
        System.out.println(student.funLevel);
    }

}
