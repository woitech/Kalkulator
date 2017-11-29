package com.kodilla.kalkulator;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int n1 = 101, n2 = -102;
        double d1 = 0.1, d2 = -0.2;
        System.out.printf("add(%d, %d): %d\n", n1, n2, calc.add(n1, n2));
        System.out.printf("add(%f, %f): %f\n", d1, d2, calc.add(d1, d2));
        System.out.printf("diff(%d, %d): %d\n", n1, n2, calc.diff(n1, n2));
        System.out.printf("diff(%d, %f): %f\n", n1, d2, calc.diff(n1, d2));
    }

    // todo: Arithmetic Overflow Checking
    public int add(int n1, int n2) { return n1 + n2; }

    // todo: Arithmetic Overflow Checking
    public double add(double d1, double d2) { return d1 + d2; }

    // todo: Arithmetic Overflow Checking
    public int diff(int n1, int n2) { return n1 - n2; }

    // todo: Arithmetic Overflow Checking
    public double diff(double d1, double d2) { return d1 - d2; }
}
