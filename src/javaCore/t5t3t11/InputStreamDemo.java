package javaCore.t5t3t11;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

/*
Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку,
        используя заданную кодировку.

        Пример:
        InputStream последовательно возвращает четыре байта: 48 49 50 51.
        Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку: "0123".

        Требования:
        1. Метод должен быть публичным.
        2. Сигнатура метода должна быть: readAsString(InputStream inputStream, Charset charset)
*/

public class InputStreamDemo {

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder stringBuilder = new StringBuilder();
        while (reader.ready()) {
            stringBuilder.append((char)reader.read());
        }
        return stringBuilder.toString();
    }

}
