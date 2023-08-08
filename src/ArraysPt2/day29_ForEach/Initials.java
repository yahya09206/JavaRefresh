package ArraysPt2.day29_ForEach;

public class Initials {
    public static void main(String[] args) {

        String[] names = {"James Bond", "Eve Rell", "Anna Johnson"};

        for (int i = 0; i < names.length; i++){

            String fullName = names[i];
            String lastName = fullName.substring(fullName.indexOf(" ") + 1);
            System.out.println(fullName.charAt(0) + "." + lastName.charAt(0));
        }

        System.out.println("-------------------------------");

        for (String each : names){

            String fullName = each;
            String lastName = fullName.substring(fullName.indexOf(" ") + 1);
            System.out.println(fullName.charAt(0) + "." + lastName.charAt(0));
        }
    }
}
