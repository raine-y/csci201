public class quizOne {
    public static void main(String[] args) {
        int i1 = 4, i2 = ++i1;
        System.out.println("1: " + i1);
        short s1 = 32767; s1++;
        System.out.println("2: " + s1);
        int i14 = 3, i15 = 2; double d2 = (double) (i14 / i15);
        System.out.println("3: " + d2);
        int i5 = 6, i6 = i5++;
        System.out.println("4: " + i5);
        short s3 = -32768; s3--;
        System.out.println("5: " + s3);
        int i7 = 7, i8 = i7--;
        System.out.println("6: " + i8);
        int i3 = 5, i4 = --i3;
        System.out.println("7: " + i4);
        short s2 = -32768; s2++;
        System.out.println("8: " + s2);
        int i12 = 3, i13 = 2; double d1 = i12 / i13;
        System.out.println("9: " + d1);
        int i9 = 3, i10 = 2, i11 = i9 / i10;
        System.out.println("10: " + i11);
    }
}