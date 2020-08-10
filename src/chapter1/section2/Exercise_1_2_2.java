package chapter1.section2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise_1_2_2 {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        Interval1D[] intervals = new Interval1D[n];

        getIntervals(intervals);
        printIntervalIntersections(intervals);

    }

    private static void getIntervals(Interval1D[] intervals){
        for (int i = 0; i < intervals.length; i++) {
            double lo = StdRandom.uniform();
            double hi = StdRandom.uniform();
            if (lo > hi) {
                double temp = hi;
                hi = lo;
                lo = temp;
            }
            intervals[i] = new Interval1D(lo, hi);
        }
    }

    private static void printIntervalIntersections(Interval1D[] intervals){
        for (int i = 0; i < intervals.length - 1; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    StdOut.printf("Interval 1 - Min: %.3f  Max: %.3f ",intervals[i].min(),intervals[i].max());
                    StdOut.printf("Interval 2 - Min: %.3f  Max: %.3f ",intervals[j].min(),intervals[j].max());
                    StdOut.println();
                }
            }
        }
    }
}
