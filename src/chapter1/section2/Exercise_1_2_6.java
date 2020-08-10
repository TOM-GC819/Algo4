package chapter1.section2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_2_6 {
    private static boolean isCircularRotation(String s, String t) {
        return s.length() == t.length() && (s + s).contains(t);
    }

    public static void main(String[] args) {
        String s1 = "ACTGACG";
        String s2 = "TGACGAC";
        String s3 = "Hello";
        String s4 = "olleH";
        StdOut.println(isCircularRotation(s1, s2));
        StdOut.println(isCircularRotation(s3, s4));
    }
}
