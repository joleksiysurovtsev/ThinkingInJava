package com.company.chapter4;

import java.util.Random;

public class VawelsAndConsonats {
    public static void main(String[] args) {
        Random random = new Random();           //Создали рандомайзер
        for (int i = 0; i < 26 ; i++) {                 //26 раз проганяем цикл
            int c = random.nextInt(26) + 'a'; //метод rand. nextint () выдает случайное число int от О до 25,

//Так как метод Random.nextint(26) генерирует значение между О и 26, для получения
//символа нижнего регистра остается прибавить смещение ·а'. Символы в апострофах
//в секциях case также представляют собой целочисленные значения, используемые
//для сравнения.

            System.out.print((char)c+", " + c +": ");
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("гласная"); break;
                case 'y':
                case 'w':
                    System.out.println("Условно гласная"); break;
                default:
                    System.out.println("согласная");
            }
        }
    }
}
