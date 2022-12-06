package javaCore.t6t2t15;

/*�������� ���������, ������� ��������� �� System.in ������������������ ����� �����,
����������� ���������, ����� ������ �� ��� ��� �����, ������� �� ������ ��������,
� ����� ������� ������������ ������������������ � �������� ������� � System.out.

��� ����� ������� � int. ������� ����� � ������������������ ���������� � ����.

��� import ��������� �� ���.

������ �����: 1 2 3 4 5 6 7 8 9 10
������ ������: 10 8 6 4 2

����������:
1. ���������� ������� ������ public static void main(String[] args)
2. ��������� ������ ������ ������ �� �������
3. ��������� ������ �������� ����� � �������*/

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
