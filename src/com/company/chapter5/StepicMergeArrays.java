package com.company.chapter5;

import java.util.Arrays;

public class StepicMergeArrays {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length]; //создали масив равный длине двух масивов которые сливаем

        int i = 0, j = 0; //индексы для масивов a1 и a2 соответственно, которые указывают на текущие элементы на каждом шаге
        // и образуют буфер который нам нужен.

        for (int k = 0; k < a3.length; k++) { // создали цикл с количеством итераций равный длине масива а3

            if (i > a1.length - 1) {
                int a = a2[j];
                a3[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                int a = a1[i];
                a3[k] = a;
                i++;
            } else if (a1[i] < a2[j]) {
                int a = a1[i];
                a3[k] = a;
                i++;
            } else {
                int b = a2[j];
                a3[k] = b;
                j++;
            }
        }


        return a3; // your implementation here
    }


    public static void main(String[] args) {
        int[] a1 = {0, 2, 2};
        int[] a2 = {1, 3};

        mergeArrays(a1,a2);
        System.out.println();
    }

}
