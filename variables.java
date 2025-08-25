public class variables {
    public static void main(String[] args) {
        int number; 
        String name; // 32bit space allocated 
        number = 73;
        name = new String("raine walker"); // Declared on HEAP vs stack
        System.out.println("number = " + number + ", name = " + name);
    }
}

/*
 *  A variable is a name given to a piece of data to call upon it
 * 
 * Variable that is primitive contains data
 * Hexadecimal addresses for var on HEAP
 * 
 */