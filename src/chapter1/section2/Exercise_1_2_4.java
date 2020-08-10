package chapter1.section2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_2_4 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1;
        str1 = "world";
        StdOut.println(str1);
        StdOut.println(str2);
    }
}
