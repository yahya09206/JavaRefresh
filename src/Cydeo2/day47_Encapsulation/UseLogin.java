package Cydeo2.day47_Encapsulation;

public class UseLogin {
    public static void main(String[] args) {

        Login obj = new Login();
//        obj.username = "jamesbond";
//        obj.password = "1234";

        obj.setUsername("jamesbond");
        obj.setPassword("1234");

        System.out.println(obj.getPassword());
        System.out.println(obj.getUsername());
    }
}
