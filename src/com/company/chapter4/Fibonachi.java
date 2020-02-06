package com.company.chapter4;

import java.util.Scanner;


/** TheTask 23*/

public class Fibonachi {
    public void f(int z) {
        //Scanner in = new Scanner(System.in);

        int x = 1;
        int y = 1;
        int sum = 0;

        System.out.println("Выводим " + z + " чисел фибоначи ");
        int f = z;

        System.out.print(x + " ");
        System.out.print(y + " ");

        for (int i = 2; i < f; i++) {
            sum = x + y;
            x = y;
            y = sum;
            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args) {
        Fibonachi fib = new Fibonachi();
        fib.f(15);
    }
}

