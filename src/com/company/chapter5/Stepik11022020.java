package com.company.chapter5;

public class Stepik11022020 {
    public static boolean isPowerOfTwo(int value) {
        if (value == 0){
            return false;
        }else {
            int res = Math.abs(value);
            return (res & (res - 1)) == 0;
        }

    }

    public static void main(String[] args) {

    }
}
