package com.company;

public class Revers{

    public static void revers(int mas[], int n) {

        int i, k, t;

        for (i = 0; i < n / 2; i++) {

            t = mas[i];

            mas[i] = mas[n - i - 1];

            mas[n - i - 1] = t;

        }
    }

}
