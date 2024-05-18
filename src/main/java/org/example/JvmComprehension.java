package org.example;


public class JvmComprehension { // ClassLoader используется для загрузки класса JvmComprehension в память


    public static void main(String[] args) {
        int i = 1; // 1. Объявление типа данных `int` ; выделяется 4 байта памяти.

        Object o = new Object(); // 2.ClassLoader загружает класс  Object для использования в коде; будет создан новый объект
        //  вместо Object ставится конкретный тип в компеляции
        // происходит поиск подходящего конструктора, который наследуется от Object
        // объект сохраняется в хипе, ссылка присваеваетя к переменной о


        Integer ii = 2; // 3. ClassLoader загружает класс  Integer для использования далее в коде
        // поиск конструктора (Integer(int))
        // выделяется память на стеке для создания объекта
        // создается новый объект класса Integer, ссылка присваевается к переменной ii, данные переменной сохраняются в хипе


        printAll(o, i, ii); // 4.
        // при выполнении кода вызывается метод printAll куда передаются 3 аргумента
        // создается новый фрейм на стеке для выполнения метода
        // в методе создается переменная uselessVar со значением 700
        // вызывается метод для печати строки System.out.println
        // метод printAll завершает свое выполнение и удаляется с стека.

        System.out.println("finished"); // 7. ClassLoader загружает класс System
        //метод main завершается, результат сохранен на стеке, затем сбрасывается
        // в консоль будет выводится строка "finished".
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;
        System.out.println(o.toString() + i + ii);
    }
}