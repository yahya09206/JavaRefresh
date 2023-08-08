package my_utilities;

public class StringUtil {

    // Method to reverse a string
    public static String reversed(String str){

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // Method to fix the format of a string ex: first letter uppercase and the rest lowercase. jOhnnY --> Johnny
    public static String fixFormat(String str){

        str = str.trim();
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }

    // Method to return how many times a character in a string is present
    public static int frequencyOfCharacter(String str, char letter){

        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++){
            if (str.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }

    // Method to return how many unique characters are in a string
    public static String uniqueCharacters(String str){

        String unique = "";
        String checked = "";

        for (int i = 0; i <= str.length() - 1; i++){
            if (!checked.contains("" + str.charAt(i))){
                int count = frequencyOfCharacter(str, str.charAt(i));
                checked += str.charAt(i);
                if (count == 1){
                    unique += str.charAt(i);
                }
            }
        }
        return unique;
    }
}
