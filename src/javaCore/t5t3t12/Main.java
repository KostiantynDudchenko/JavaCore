package javaCore.t5t3t12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.nio.*;
import java.util.*;

        /*Напишите программу, читающую текст из System.in и выводящую в System.out сумму
        всех встреченных в тексте вещественных чисел с точностью до шестого
        знака после запятой. Числом считается последовательность символов,
        отделенная от окружающего текста пробелами или переводами строк и успешно
        разбираемая методом Double.parseDouble.

        На этот раз вам надо написать программу полностью, т.е. объявить
        публичный класс с именем Main  и точку входа в программу — метод  main.
        И добавить все необходимые импорты

        Пример ввода 1: 1 2 3
        Пример вывода 1: 6.000000

        Пример ввода 2: a1 b2 c3
        Пример вывода 2: 0.000000

        Пример ввода 3:  -1e3 18 .111 11bbb
        Пример вывода 3: -981.889000

        Требования:
        1. Программа должна читать текст из System.in
        2. Программа должна выводить число с точностью до 6 знака после запятой*/

public class Main {

     public static void readerFromSystemIn () throws IOException{
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         StringBuilder stringBuilder = new StringBuilder();
         while (bufferedReader.ready()) {
             stringBuilder.append((char) bufferedReader.read());
         }
         String[] strings = stringBuilder.toString().split("( |\n)");

         double d = 0;
         for (int i = 0; i < strings.length; i++) {
             try {
                 d += Double.parseDouble(strings[i]);
             } catch (NumberFormatException e) {
             }
         }
         System.out.printf(Locale.ENGLISH, "%.6f", d);
     }

    public static void main(String[] args) throws IOException {
         Main.readerFromSystemIn();

    }
}

