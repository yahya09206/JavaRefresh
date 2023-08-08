package day23_ArraysContinued;

public class Grades {
    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];

        for (int i = 0; i <= names.length - 1; i++){
//            String each = names[i];
//            System.out.println(each);

            if (scores[i] >= 90){
                grades[i] = 'A';
            }else if (scores[i] >= 80){
                grades[i] = 'B';
            }else if(scores[i] >= 70){
                grades[i] = 'C';
            }else if (scores[i] >= 60){
                grades[i] = 'D';
            }else{
                grades[i] = 'F';
            }

            System.out.println(names[i] + ": " + scores[i] + ":" + grades[i]);
        }
    }
}
