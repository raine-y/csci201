import java.util.Arrays;

public class Assignment18 {

    public static void print(int[][] array) {
        // Your code starts here
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        // Your code ends here
    }

    public static double average(int[][] array) {
        // Your code starts here
        double sum =0;
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                length++;
            }
        }
        return sum/length;
        // Your code ends here
    }

    public static void main(String[] args) {
        int[][] scores = {
                { 1, 2, 3 },
                { 7, 8, 9 }
        };
        System.out.println("Below is a 2-dimensional array:");
        print(scores);
        System.out.println("Average of all cells = " + average(scores));
    }

}