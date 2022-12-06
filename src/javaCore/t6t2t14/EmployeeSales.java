package javaCore.t6t2t14;

/*Магазину нужно сохранять информацию о продажах для каждого сотрудника.
Напишите метод Map getSalesMap(Reader reader) который принимает Reader содержащий строки вида:

Алексей 3000
Дмитрий 9000
Антон 3000
Алексей 7000
Антон 8000
Метод должен получить все строки из Readera и заполнить и
вернуть карту где ключом будет имя сотрудника, а значением сумма всех его продаж.

Пример ввода:


Алексей 3000
Дмитрий 9000
Антон 3000
Алексей 7000
Антон 8000
Пример вывода:
{Алексей=[10000], Дмитрий=[9000], Антон=[11000]}

Требования:
1. Должен быть метод public static Map<String, Long> getSalesMap(Reader reader)
2. Работа метода getSalesMap должна удовлетворять условию*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeSales {

    public static Map<String, Long> getSalesMap(Reader reader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        Map<String, Long> map = new HashMap<>();
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            String[] strings = string.split(" ");
            if (map.containsKey(strings[0])) {
                map.put(strings[0], map.get(strings[0]) + Long.valueOf(strings[1]));
            } else {
                map.put(strings[0], Long.valueOf(strings[1]));//Твой код здесь
            }
        }
        return map;
    }

    public static void main(String[] args) throws IOException {
        String s = "Алексей 3000\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000";
        BufferedReader reader = new BufferedReader(new StringReader(s));
        /*String str;
        while((str = reader.readLine())!= null) {
            System.out.println(str);
        }
        reader.close();*/

        Map<String, Long> map = EmployeeSales.getSalesMap(reader);
        System.out.println(map.toString());
    }
}
