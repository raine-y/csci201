import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Assignment17 {

    private static int max(int[] array) {
        // Your code starts here
        int max = Arrays.stream(array).max().getAsInt();
        return max;
        // Your code ends here
    }

    private static int search(int[] array, int key) {
        // Your code starts here
            return IntStream.range(0, array.length)
                    .filter(i -> array[i] == key)
                    .findFirst()
                    .orElse(-1);
        // Your code ends her
    }

    public static void main(String[] args) {
        int[] scores = { 4, 6, 8, 0, 2 };
        System.out.println("Max" + Arrays.toString(scores) + " = " + max(scores));

        int toSearch = 7;
        int index = search(scores, toSearch);
        if (index < 0)
            System.out.println(toSearch + " is NOT in " + Arrays.toString(scores));
        else
            System.out.println(toSearch + " is at index " + index +
                    " in " + Arrays.toString(scores));

        toSearch = 8;
        index = search(scores, toSearch);
        if (index < 0)
            System.out.println(toSearch + " is NOT in " + Arrays.toString(scores));
        else
            System.out.println(toSearch + " is at index " + index +
                    " in " + Arrays.toString(scores));
    }

}

/*
 * OUTPUT:
 * 
 * Max[4, 6, 8, 0, 2] = 8
 * 7 is NOT in [4, 6, 8, 0, 2]
 * 8 is at index 2 in [4, 6, 8, 0, 2]
 */