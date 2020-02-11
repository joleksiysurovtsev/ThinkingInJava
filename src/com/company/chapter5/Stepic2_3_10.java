package com.company.chapter5;

/**Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка,
  которая читается одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности"
  строки должны учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр символов должны игнорироваться.
  Гарантируется, что в метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания).
  Т.е. русских, китайских и прочих экзотических символов в строке не будет.

 Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

 Подсказки (не читайте, если хотите решить сами):

 для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться регулярным выражением "[^a-zA-Z0-9]";
 найдите в классе String метод, выполняющий замену по регулярному выражению;
 для перестановки символов строки в обратном порядке можно воспользоваться методом reverse(), который находится в классе StringBuilder;
 в классе String есть методы для преобразования всей строки в верхний и нижний регистр.*/

public class Stepic2_3_10 {

    public static boolean isPalindrome(String text) {


        // считал строку и очистил её он ненужных символов
        String cleartext = text.replaceAll("[^a-zA-Z0-9]", "");//удалили из строки лишнее
        String text1 = cleartext;

//        System.out.println(text1); //проверка


        //перевернул её спомощью стригбилдера
        StringBuilder stringBuilder1 = new StringBuilder(text1);                     //передали строку в StringBuilder
        stringBuilder1.reverse();                                                       //перевернул
        String text2 = stringBuilder1.toString();                                       //вернул строкой

//        System.out.println(text2); //проверка

        //перевёл строки в масивы символов
        char[] masivPervoyStroki = text1.toCharArray();
        char[] masivVtorvoyStroki = text2.toCharArray();

        //счётчик
        int count = 0;

        for (int i = 0, j = text2.length() - 1; j >= 0; i++, j--) {

            //берём первый символ первой строки и первый второй строки(перевёрнутой)
            char x = masivPervoyStroki[i];
            char y = masivVtorvoyStroki[i];

            //символы переводив в строки
            String x1 = Character.toString(x);
            String y1 = Character.toString(y);

            //сравниваем их если равны то щётчик увеличиваем
            if (x1.equalsIgnoreCase(y1)) {
                count++;
            }

        }
//        System.out.println(count);
//        System.out.println(text2.length());

        //если счётчик равен количеству всех символов в строке то всё совпало
        boolean rez = count == text2.length();
//        System.out.println(rez);
        return rez;
    }


    public static void main(String[] args) {

        isPalindrome("Madam, I'm Adam!");


    }
}
