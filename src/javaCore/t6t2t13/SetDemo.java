package javaCore.t6t2t13;

/*���������� ����� symmetricDifference, ����������� �������������� �������� ���� ��������.
����� ������ ���������� ��������� � ���� ������ ���������. �������� ���������� � ����
��������� �� �����������.

������ �����: [1, 2, 3} � {0, 1, 2]
������ ������: [0, 3]

����������:
1. ������ ���� ����� public static Set symmetricDifference(Set set1, Set set2)
2. ����� symmetricDifference �� ������ �������� �������� ���������
3. ����� symmetricDifference ������ ���������� ���������� ���������*/

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set3 = new HashSet<>(set1);
        Set<T> set4 = new HashSet<>(set2);
        set3.removeAll(set2);
        System.out.println(set3.toString());
        set4.removeAll(set1);
        System.out.println(set4.toString());
        set3.addAll(set4);
        return set3;
    }

    public static void main(String[] args) {
/*������ �����: [1, 2, 3} � {0, 1, 2]
������ ������: [0, 3]*/

        Set<Integer> int1 = new HashSet<>();

        int1.add(1);
        int1.add(2);
        int1.add(3);

        Set<Integer> int2 = new HashSet<>();

        int2.add(0);
        int2.add(1);
        int2.add(2);

        Set set = SetDemo.symmetricDifference(int1, int2);
        System.out.println(set.toString());

    }

}

