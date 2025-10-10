public class Stars {
    public static void main(String[] args) {
        final int MAX_ROWS = 10;
        final int HALF_ROWS = 5;
        System.out.println("a.");
        System.out.println("");
        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 10; star >= row; star--)
            System.out.print("*");
            System.out.println();
        }
        System.out.println("");
        System.out.println("b.");
        System.out.println("");
         for (int row = 1; row <= MAX_ROWS; row++) {
            for (int space = 9; space >= row; space--)
            System.out.print(" ");
            for (int star = 1; star <= row; star++)
            System.out.print("*");
            System.out.println();
        } 
        System.out.println("");
        System.out.println("c.");
        System.out.println("");
        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int space = 2; space <= row; space++)
            System.out.print(" ");
            for (int star = 10; star >= row; star--)
            System.out.print("*");
            System.out.println();
        } 
        System.out.println("");
        System.out.println("d.");
        System.out.println("");
        for (int row = 1; row <= HALF_ROWS; row++) {
            for (int space = 4; space >= row; space--)
            System.out.print(" ");
            for (int star = 1; star <= row * 2 - 1; star++)
            System.out.print("*");
            System.out.println();
        } for (int row = 1; row <= HALF_ROWS; row++) {
            for (int space = 2; space <= row; space++)
            System.out.print(" ");
            for (int star = 9; star >= row * 2 - 1; star--)
            System.out.print("*");
            System.out.println();
        }
    }
}
