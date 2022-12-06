package javaCore.t7t1t8;


/*Напишите метод с названием sqrt, который возвращает реализацию функционального
интерфейса UnaryOperator, который принимает целое число(тип int) и возвращает его квадрат.

Требования:
1. Должен быть метод public UnaryOperator sqrt()
2. Метод должен возвращать реализацию интерфейса UnaryOperator.
3. Реализация должна соответствовать условию*/

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    public static UnaryOperator<Integer> sqrt() {
         return x -> x * x;//Твой код здесь
    }

    public static void main(String[] args) {
    }
}
