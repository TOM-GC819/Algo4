package chapter1.section3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Evaluate {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            String in = StdIn.readLine();
            StdOut.println(compExp(in));
        }
    }

    private static double compExp(String expression) {
        String[] arr = expression.split(" ");
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        for (String s : arr) {
            switch (s) {
                case "(":
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "sqrt":
                    ops.push(s);
                    break;
                case ")":
                    String op = ops.pop();
                    Double v = vals.pop();
                    switch (op) {
                        case "+":
                            v = vals.pop() + v;
                            break;
                        case "-":
                            v = vals.pop() - v;
                            break;
                        case "*":
                            v = vals.pop() * v;
                            break;
                        case "/":
                            v = vals.pop() / v;
                            break;
                        case "sqrt":
                            v = Math.sqrt(v);
                            break;
                    }
                    vals.push(v);
                    break;
                default:
                    vals.push(Double.parseDouble(s));
                    break;
            }
        }
        return vals.pop();
    }
}
