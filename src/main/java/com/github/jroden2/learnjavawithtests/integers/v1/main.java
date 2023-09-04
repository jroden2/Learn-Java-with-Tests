package com.github.jroden2.learnjavawithtests.integers.v1;

public class main {

    public static int Add(int x, int y) {
        return x + y;
    }

    public static int Subtract(int x, int y) {
        return x - y;
    }

    public static int Multiply(int x, int y) {
        return x * y;
    }

    public static int Divide(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        System.out.println(Add(2,2));
        System.out.println(Subtract(2,2));
        System.out.println(Multiply(2,2));
        System.out.println(Divide(2,2));
    }

}
