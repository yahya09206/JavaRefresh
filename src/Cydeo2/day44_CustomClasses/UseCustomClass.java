package Cydeo2.day44_CustomClasses;

public class UseCustomClass {
    public static void main(String[] args) {

        Employee employee1 = new Employee("James", "Secret Agent");
        System.out.println(employee1);

        Employee employee2 = new Employee("Eman", 25, "SDET", 300_000);
        System.out.println(employee2);

        employee1.goToMeeting();
        employee2.goToMeeting();

    }
}
