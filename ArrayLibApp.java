import java.util.Arrays;

public class ArrayLibApp {
    public static void main(String[] args) {

        int[] array = new int[] { 10, 40, 32, 20, 50 };

        System.out.println("Array -> " + Arrays.toString(array));
        System.out.print("Array -> ");
        ArrayLib.print(array);
        System.out.println("Sum of all elements: " + ArrayLib.sum(array));
        System.out.println("Average of all elements: " + ArrayLib.average(array));
        System.out.println("Smallest value: " + ArrayLib.min(array));
        System.out.println("Greatest value: " + ArrayLib.max(array));

        int searched = 37;
        boolean isIn = ArrayLib.isIn(array, searched);

        System.out.println("You searched for: " + searched);

        if (isIn == true) {
            System.out.print(isIn + ": ");
            System.out.println(searched + " is present in the array");
        } else if (isIn == false) {
            System.out.print("![" + isIn + "]: ");
            System.out.println(searched + " is NOT present in the array");
        }

        searched = 33;

        int index = ArrayLib.search(array, searched);
        if (index < 0) {
           System.out.print("![" + index + "]: ");
            System.out.println(searched + " is NOT present in the array"); 
        }

        searched = 50;
        index = ArrayLib.search(array, searched);
        if (index >= 0) {
            System.out.println(searched + " is present at index: " + index); 
        }
    }
}