public class StudentsScoresTracker{
    public static void main(String[] args){

        String[] names = { "Tev", "Kat", "Scott"};

        int[] scores = {80,85,90};

        int s = names.length;

        System.out.println("Student Scores:");
        for(int i = 0; i < s; i++){
            System.out.println(names[i] + " : " + scores[i]);
        }
    }


}