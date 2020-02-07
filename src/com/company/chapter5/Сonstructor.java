package com.company.chapter5;

public class Сonstructor {
    public static void main(String[] args) {
        Human human = new Human ("Петя");

    }
}

class Human{

    private String name;
    private int age;

    public Human(){
       this.age = 0;
       this.name = "Имя по умолчанию";
        System.out.println(age + " " + name);
    }

    public Human (String name){     //перегрузка методов
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Human(String name, int age){
        System.out.println("Привет из третьего конструктора");
        this. name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}