package day24_ArraysPt3;

public class GradeName {
    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];
        int score = scores[0];


        for (int i = 0; i <= grades.length - 1; i++){

            if (scores[i] >= 90){
                grades[i] = 'A';
            }else if (scores[i] >= 80){
                grades[i] = 'B';
            }else if (scores[i] >= 70){
                grades[i] = 'C';
            }else if (scores[i] >= 60){
                grades[i] = 'D';
            }else {
                grades[i] = 'F';
            }

            System.out.println(names[i] + " : " + scores[i] + ": " + grades[i]);
        }

//        int score = scores[0];
//        if (score >= 90){
//            grades[0] = 'A';
//        }else if (score >= 80){
//            grades[0] = 'B';
//        }else if (score >= 70){
//            grades[0] = 'C';
//        }else if (score >= 60){
//            grades[0] = 'D';
//        }else {
//            grades[0] = 'F';
//        }
    }
}
