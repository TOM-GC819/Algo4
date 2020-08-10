package chapter1.section2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise_1_2_1 {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        Point2D[] points = new Point2D[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point2D(StdRandom.uniform(), StdRandom.uniform());
            points[i].draw();
        }
        StdOut.printf("The shortest distance within the points sets is: %.3f", findMinDistance(points));
    }

    private static double findMinDistance(Point2D[] points){
        double minDis = points[0].distanceTo(points[1]);
        double currDis;

        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                currDis = points[i].distanceTo(points[j]);
                if(currDis <= minDis){
                    minDis = currDis;
                }
            }
        }
        return minDis;
    }

}
