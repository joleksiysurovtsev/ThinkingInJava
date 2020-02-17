package com.company.chapter5;

public class NoSynthesis{
    public static void main(String[] args) {
        Bird2 b = new Bird2(); // нет конструктора по умочанию
        Bird2 b2 = new Bird2(1);
        Bird2 b3 = new Bird2(1.0);
        Bird2 b4 = new Bird2("Строка строчная ))");
    }
}
