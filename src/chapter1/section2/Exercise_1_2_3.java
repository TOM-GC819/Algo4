package chapter1.section2;

import edu.princeton.cs.algs4.*;

public class Exercise_1_2_3 {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        double min = StdIn.readDouble();
        double max = StdIn.readDouble();

        Interval2D[] intervals = new Interval2D[n];

    }

    private static Interval1D get1DIntervals(double min, double max) {
        double lo = StdRandom.uniform(min, max);
        double hi = StdRandom.uniform(min, max);
        if (lo > hi) {
            double temp = hi;
            hi = lo;
            lo = temp;
        }

        Interval1D interval = new Interval1D(lo, hi);
        return interval;
    }

    private static void get2DIntervals(Interval2D[] intervals, double min, double max){
        
    }

    private static void printIntervalIntersections(Interval1D[] intervals) {
        for (int i = 0; i < intervals.length - 1; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    StdOut.printf("Interval 1 - Min: %.3f  Max: %.3f ", intervals[i].min(), intervals[i].max());
                    StdOut.printf("Interval 2 - Min: %.3f  Max: %.3f ", intervals[j].min(), intervals[j].max());
                    StdOut.println();
                }
            }
        }
    }
}
