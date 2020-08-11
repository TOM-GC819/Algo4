package chapter1.section2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_2_7 {
    private static String mystery(String s) {// returns the reverse string of s;
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N / 2);
        String b = s.substring(N / 2, N);
        return mystery(b) + mystery(a);
    }

    public static void main(String[] args) {
        String s = "Hello World";
        StdOut.println(mystery(s));
        StdOut.println(new StringBuilder(s).reverse());
    }
}
