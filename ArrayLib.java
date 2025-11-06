public class ArrayLib {

    public static void print(int[] array) {
        System.out.print("{");
        int index = 0;
        for (int element : array) {
            System.out.print(element);
            if (index != array.length - 1) {
                System.out.print(", ");
                index++;
            }
        }
        System.out.println("}");
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public static double average(int[] array) {
        return sum(array) / (double) array.length; // (double) typecasting to avoid integer division
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static boolean isIn(int[] array, int searched) {
        for (int element : array){
            if (element == searched) {
                return true;
            }
        }
        return false;
    }

    public static int search(int[] array, int searched) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == searched) {
                return i;
            }
        }
        return -1;
    }

}