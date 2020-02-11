package com.company.chapter5;

import java.util.Arrays;

public class MergeArrays {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int maxleght = 0;
        int x = a1.length;
        int y = a2.length;

        int[] newArray;

        if (x > y) {
            maxleght = x;
        } else {
            maxleght = y;
        }

        for (int i = 0; i < maxleght; i++) {



        }


        return ...; // your implementation here
    }


    public static void main(String[] args) {
        int[] a1 = {0, 2, 2, 10, 10, 20};
        int[] a2 = {1, 3, 5, 7, 8, 10, 10};
        mergeArrays(a1, a2);
    }


}
