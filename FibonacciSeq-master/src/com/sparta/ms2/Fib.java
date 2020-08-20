package com.sparta.ms2;

public class Fib {

    public void Fibonacci(int x) {
        int fibsequence1 = 0, fibsequence2 = 1;


        for (int i = 1; i <= x; ++i) {
            System.out.println(fibsequence1);

            int fibn = fibsequence1 + fibsequence2;
            fibsequence1 = fibsequence2;
            fibsequence2 = fibn;
        }
    }
}