package com.company.chapter4;

public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:                                               //1.создали метку
        for (; true; ) {                                     //2.запустили цикл который будет вечным
            inner:                                           //ещё одна метка
            for (; i < 10; i++) {                            //цикл котоый выполняется 10 раз
                System.out.println("i = " + i);              //3.выводим i = 0  //5. выводим i = 1

                if (i == 2) {                                //7. проверка если i == 2 выводим и прыгем в начало цикла
                    System.out.println("continue");
                    continue;
                }                                            //8.итакдалее
                if (i == 3) {                                // проверяем
                    System.out.println("break");             //выводим break
                    i++;                                     //i делаем
                    break;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {                //4. прыгаем в этот цикл увеличиваем к до 3  //6.повторяемся
                    if (k == 3) {                            //выводим на экран сообщение
                        System.out.println("continue inner");
                        continue inner;                       //выпрыгиваем на иннер
                    }
                }
            }
        }
    }
}
