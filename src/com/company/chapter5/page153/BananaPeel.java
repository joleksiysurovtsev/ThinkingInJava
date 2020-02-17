package com.company.chapter5.page153;


class Banana{
    void pell(int i){
        /* ... */
    }
}


public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana(), b = new Banana();
        a.pell(1);
        b.pell(2);
        /**Чтобы программа могла записываться в объектно-ориентированном стиле, основанном
         на «отправке сообщений объектам~, компилятор выполняет для вас некоторую тайную
         работу. При вызове метода peel () передается скрытый первый аргумент - не что
         иное, как ссылка на используемый объект. Таким образом, вызовы указанного метода
         на самом деле можно представить как:
         Banana.peel(a,1);
         Banana.peel(b,2);*/




    }


}
