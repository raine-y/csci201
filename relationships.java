public class relationships {
    public static void main(String[] args) {
        int i1 = 2, i2 = 3, i3 = 2;
        boolean b1 = true;
        b1 = i1 > i2;
        System.out.println(b1);
        System.out.println(i1 + " > " + i3 + ": " + (i1 > i2));
        System.out.println(i1 + " < " + i2 + ": " + (i1 < i2));
        System.out.println(i1 + " >= " + i2 + ": " + (i1 >= i2));
        System.out.println(i3 + " <= " + i1 + ": " + (i1 <= i3));
        System.out.println(i3 + " == " + i1 + ": " + (i1 == i3));
        System.out.println(i3 + " == " + i2 + ": " + (i1 == i2));
        System.out.println(i3 + " != " + i1 + ": " + (i1 != i3));
        System.out.println(i3 + " != " + i2 + ": " + (i1 != i2));
    }
}