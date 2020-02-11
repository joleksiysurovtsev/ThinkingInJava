package com.company.chapter5;

import java.math.BigInteger;

public class Faktiria {
    static BigInteger calculateFactorial(int n){
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i <=n; i ++){
            res = res.multiply(BigInteger.valueOf(i)) ;

        }


        return res;
    }


    public static void main(String[] args) {
        calculateFactorial(3);
    }
    }
