package com.company.chapter5;

public class OverLoading{
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Перегреженый метор");
        }
    }
}
