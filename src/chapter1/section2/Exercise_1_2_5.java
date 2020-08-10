package chapter1.section2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_2_5 {
    public static void main(String[] args) {
        String s = "Hello World";
        String s1 = s.toUpperCase();
        String s2 = s.substring(6, 11);
        StdOut.println(s + "\n" + s1 + "\n" + s2 + "\n");
    }
}
