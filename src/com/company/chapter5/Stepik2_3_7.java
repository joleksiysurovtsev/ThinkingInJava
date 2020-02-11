package com.company.chapter5;

public class Stepik2_3_7 {
    public static void main(String[] args) {
        String x = 'A' + "12";
        String x2 = "A" + ('\t' + '\u0003');
        String x3 = 'A' + '1' + "2";
        String x4 = "A" + 12;


        System.out.println(x);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);

    }

}
