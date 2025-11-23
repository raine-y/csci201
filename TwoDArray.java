public class TwoDArray {
    public static void main(String[] args) {

        int[][] scores = {
                { 5, 4, 4, 3, 5, 5, 5 },
                { 2, 3, 5, 4, 1, 1, 3 },
                { 5, 5, 4, 3, 2, 1, 1 },
                { 3, 1, 2, 3, 1, 3, 4 },
                { 4, 2, 3, 1, 5, 4, 2 }
        };

        final int SODAS = scores.length; // vertical (soda entries)
        int RESPONDENTS = scores[0].length; // horizontal (number of respondents)

        int[] sodaSum = new int[SODAS];
        int[] respSum = new int[RESPONDENTS];

        for (int s = 0; s < SODAS; s++) {
            for (int r = 0; r < RESPONDENTS; r++) {
                sodaSum[s] += scores[s][r];
                respSum[r] += scores[s][r];
            }
        }

        System.out.println("Average Scores: ");
        System.out.println(" ");

        for (int s = 0; s < SODAS; s++) {
            double result = (float) sodaSum[s] / RESPONDENTS;
            System.out.println("Soda " + (s + 1) + ": " + result);
        }

        System.out.println(" ");
        System.out.println("Respondent Averages: ");
        System.out.println(" ");

        for (int r = 0; r < RESPONDENTS; r++) {
            double result = (float) respSum[r]/SODAS;
            System.out.println("Respondent " + (r + 1) + ": " + result);
        }
    }
}