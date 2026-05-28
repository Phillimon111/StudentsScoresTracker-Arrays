public class StudentsScoresTracker {
    public static void main(String[] args) {

        String[] names = {"Tev", "Kat", "Scott"};
        int[] scores = {80, 85, 90};
        int s = names.length;

        // Print all scores
        System.out.println("Student Scores:");
        for (int i = 0; i < s; i++) {
            System.out.println(names[i] + " : " + scores[i]);
        }
        //Adding and update to the Kat

        System.out.println("Kat took a re-write");
        scores[1] = 95;
        System.out.println("Updated scores");
        for (int i = 0; i < s; i++) {
            System.out.println(names[i] + ":" + scores[i]);

        }
        // Highest score
        int highest = scores[0];
        for (int i = 1; i < s; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }
        System.out.println("Highest score: " + highest);

        // Lowest score
        int lowest = scores[0];
        for (int i = 1; i < s; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        System.out.println("Lowest score: " + lowest);

        // Average
        int total = 0;
        for (int i = 0; i < s; i++) {
            total += scores[i];
        }
        double average = (double) total / s;
        System.out.println("Class average: " + average);

        // Top student
        int topIndex = 0;
        for (int i = 1; i < s; i++) {
            if (scores[i] > scores[topIndex]) {
                topIndex = i;
            }
        }
        System.out.println("Top student: " + names[topIndex]);
    }
}