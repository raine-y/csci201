public class increment {
    public static void main(String[] args) {
        int i1 = 1;
        System.out.println(i1);
        i1 = i1 + 1; // +1
        System.out.println(i1);
        i1 += 1; // +1 (+=, -=, *=, /=, %=)
        System.out.println(i1);
        i1++; // +1, post-increment
        System.out.println(i1);
        ++i1; // +1, pre-increment
        System.out.println(i1);
        i1--; // -1, post-decrement
        System.out.println(i1);
        --i1; // -1, pre-decrement
        System.out.println(i1);
        /* ~~~~~~~~~~~~~~~~~~ */
        System.out.println("~~~~~~~~~");
        /* ~~~~~~~~~~~~~~~~~~ */
        int i3 = 25;
        System.out.println("i3++ = " + i3++);
        System.out.println("i3 = " + i3);
    }
}
