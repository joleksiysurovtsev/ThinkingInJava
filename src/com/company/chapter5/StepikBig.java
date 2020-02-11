package com.company.chapter5;

public class StepikBig {
    public static boolean doubleExpression(double a, double b, double c) {

        return Math.abs(a) + Math.abs(b) == c;
    }

    public static char charExpression(int a) {
        int x = '\\' + a;

        return (char) x;
    }


    public static void main(String[] args) {
        doubleExpression(0.1, 0.3, 0.3);
        System.out.println(doubleExpression(0.1, 0.1, 0.2));
        System.out.println(0x0bp3);

        int intValue = 1024;
        byte byteValue = (byte) intValue;
        System.out.println(byteValue);
        //System.out.println(charExpression(32));
        int x = '\\';
        System.out.println(charExpression(29));


        int z = 4;
        long g = z;
        System.out.println(g);

    }
}
