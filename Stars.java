public class Stars {
    public static void main(String[] args) {
        final int MAX_ROWS = 10;
        System.out.println("a.");
        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 10; star >= row; star--)
            System.out.print("*");
            System.out.println();
        }
        System.out.println("b.");
    }
}
