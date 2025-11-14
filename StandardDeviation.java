public class StandardDeviation {

    public static void main(String[] args) {
        int[] intArray = { 10, 12, 23, 23, 16, 23, 21, 16, 16, 60, 14, 19, 29, 30, 25, 13, 19, 15, 17, 20, 81 }; // Sample integer array
        lengthCheck(intArray);
        double mean = calculateMean(intArray);
        double standardDeviation = calculateStandardDeviation(intArray, mean);
        displayResults(mean, standardDeviation);
    }

    public static double calculateMean(int[] a) {
        double sum = arraySum(a);
        return sum / a.length;
    }

    public static double calculateStandardDeviation(int[] a, double mean) {
        double sumOfSquaredDifferences = 0;
        for (int num : a) {
            sumOfSquaredDifferences += Math.pow(num - mean, 2);
        }
        double variance = sumOfSquaredDifferences / a.length;
        return Math.sqrt(variance);
    }

    public static void displayResults(double m, double sD) {
        System.out.println("Mean: " + m);
        System.out.println("Standard Deviation: " + sD);
    }

    public static double arraySum(int[] a) {
        double sum = 0;
        for (int num : a) {
            sum += num;
        }
        return sum;
    }

    public static boolean lengthCheck(int[] a) {
        if (a.length <= 50) {
            return true;
        }
        System.out.println("Too many entries. Please limit to 50 or fewer.");
        return false;
    }

}