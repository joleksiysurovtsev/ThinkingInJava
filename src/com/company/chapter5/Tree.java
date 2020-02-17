package com.company.chapter5;


//создали класс дерево
public class Tree {
    //переменная (высота дерева)
    int height;

    //метод (конструктор дерева)
    //который ничего не принимает только инициализирует обьект дерево и присваивает ему значение 0
    Tree(){
        System.out.println("Сажаем росток");
        height = 0;
    }

    //Метод перегруженый из предыдущего метода но принимающий значение на входе initialHeight и
    // присваювающий ето значение в переменную height

    Tree(int initialHeight){
        height = initialHeight;
        System.out.println("Создание нового дерева высотой " + height + "м." );
    }


    /*теперь мы можем создать обьект Дерево и он по умолчвнию будет высотой 0 м.
    * или мы можем сразу при создании указать высоту*/

   void info(){
        System.out.println("Дерево высотой " + height + "м.");
    }
    void  info(String s){
        System.out.println(s + ": Дерево высотой " + height + "м.");
    }
}


