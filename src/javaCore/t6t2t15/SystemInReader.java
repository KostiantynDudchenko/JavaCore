package javaCore.t6t2t15;

/*Напишите программу, которая прочитает из System.in последовательность целых чисел,
разделенных пробелами, затем удалит из них все числа, стоящие на четных позициях,
и затем выведет получившуюся последовательность в обратном порядке в System.out.

Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.

Все import объявлены за вас.

Пример ввода: 1 2 3 4 5 6 7 8 9 10
Пример вывода: 10 8 6 4 2

Требования:
1. Необходимо наличие метода public static void main(String[] args)
2. Программа должна читать данные из консоли
3. Программа должна выводить текст в консоль*/

import java.util.*;

public class SystemInReader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new LinkedList<>();
        boolean b = true;
        while (scanner.hasNextInt()) {
            deque.add(scanner.nextInt());
        }
        Iterator<Integer> it = deque.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i % 2 == 0) {
                it.next();
                it.remove();
                i++;
            } else {
                it.next();
                i++;
            }
        }
        Iterator<Integer> it2 = deque.descendingIterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
