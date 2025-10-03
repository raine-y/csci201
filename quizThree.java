public class quizThree {
    public static void main(String[] args) {
        int i35 = 2; boolean b6 = i35 > 0 || ++i35 > 0;
        System.out.println("1: " + i35);
        int i31 = 1, i32 = 2, i33 = i31 > i32 ? i31 * 2 : i32 * 2;
        System.out.println("2: " + i33);
        String st5 = new String("A"), st6 = new String("A"); boolean b5 = st6.equals(st5);
        System.out.println("3: " + b5);
        String st7 = new String("A"), st8 = new String("A"); int i34 = st8.compareTo(st7);
        System.out.println("4: " + i34);
        System.out.print("5.1: ");
        System.out.println(3 != 2);
        System.out.println("5.2: " + !(3 == 2));
        boolean t2 = true, f3 = false, b2 = ! t2&&f3;
        System.out.println("6: " + b2);
        int i29 = 30;
        int i30 = 20;
        System.out.print("7: ");
        System.out.println((i29 + (2 * 2)) < (i30 - (3 * 4))); 
        System.out.print("7.1: ");
        System.out.println((i29 + 2 * 2) < (i30 - 3 * 4));
        System.out.print("7.2: ");
        System.out.println(i29 + 2 * 2 < i30 - 3 * 4);
        System.out.print("7.3: ");
        System.out.println(i29 + (2 * 2) < i30 - (3 * 4));
        int score = 0;
        System.out.print("8: ");
        System.out.println(score >= 0 && score <= 50);
        System.out.print("8.1: ");
        System.out.println(!(score < 0) && !(score > 50));
        System.out.print("8.2: ");
        System.out.println(!(score < 0 || score > 50));
        int i36 = 2; boolean b7 = i36 < 0 && --i36 > 0;
        System.out.println("9: " + i36);
        boolean f1 = false, t1 = true, f2 = false, b1 = t1||f1 && f2;
        System.out.println("10: " + b1);
        String st3 = new String("A"), st4 = new String("A"); boolean b4 = st3 == st4;
        System.out.println("11: " + b4);
    }
}
